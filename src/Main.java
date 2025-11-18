// Main.java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.lang.reflect.Method;

/**
 * Main genérico para executar o lexer/parser gerados pelo ANTLR
 * - Passe o arquivo de entrada como primeiro argumento (ex: java Main exemplo.jaba)
 * - O código tenta invocar automaticamente uma lista de possíveis regras raiz.
 *
 * Ajustes:
 * - Substitua "JabaLexer" e "JabaParser" pelos nomes gerados pela sua gramática, se forem diferentes.
 * - Se quiser sempre usar uma regra específica, altere o array ROOT_CANDIDATES ou chame parser.suaRegra();
 */
public class Main {
    // Nome das classes geradas pelo ANTLR (mude se difere)
    private static final String LEXER_CLASS = "JabaLexer";
    private static final String PARSER_CLASS = "JabaParser";

    // Lista de nomes de regras raiz tentadas (ordem de preferência)
    private static final String[] ROOT_CANDIDATES = {
            "program",
            "programa",
            "prog",
            "start",
            "compilationUnit",
            "file"
    };

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Uso: java Main <arquivo.jaba>");
            System.exit(1);
        }

        String inputFile = args[0];

        // leitura do arquivo
        CharStream input = CharStreams.fromFileName(inputFile);

        // instancia lexer via reflexão (para ser mais portátil caso você tenha outro pacote)
        Class<?> lexerClass = Class.forName(LEXER_CLASS);
        Object lexer = lexerClass.getConstructor(CharStream.class).newInstance(input);
        TokenSource tokenSource = (TokenSource) lexer;
        CommonTokenStream tokens = new CommonTokenStream(tokenSource);

        // instancia parser
        Class<?> parserClass = Class.forName(PARSER_CLASS);
        Object parser = parserClass.getConstructor(TokenStream.class).newInstance(tokens);

        // opcional: remover listeners padrões e adicionar listener diagnóstico
        try {
            // remove error listeners
            Method removeListeners = parserClass.getMethod("removeErrorListeners");
            removeListeners.invoke(parser);
        } catch (NoSuchMethodException ignored) { }

        try {
            Method addDiag = parserClass.getMethod("addErrorListener", org.antlr.v4.runtime.ANTLRErrorListener.class);
            addDiag.invoke(parser, new DiagnosticErrorListener());
        } catch (Exception ignored) { }

        // Tenta invocar cada candidato de regra raiz até encontrar uma que exista e retorne um ParseTree
        ParseTree tree = null;
        Method usedMethod = null;

        for (String ruleName : ROOT_CANDIDATES) {
            try {
                Method m = parserClass.getMethod(ruleName);
                Object result = m.invoke(parser);
                if (result instanceof ParseTree) {
                    tree = (ParseTree) result;
                    usedMethod = m;
                    break;
                }
            } catch (NoSuchMethodException nsme) {
                // a regra não existe no parser gerado: tenta próxima
            } catch (Exception e) {
                // se a chamada falhar por erro de parse, mostramos a mensagem e tentamos seguir (ou sair)
                System.err.println("Erro ao tentar invocar regra '" + ruleName + "': " + e.getMessage());
                // continue para tentar próximo candidato
            }
        }

        if (tree == null) {
            System.err.println("Nenhuma das regras raiz padrão foi encontrada no parser.");
            System.err.println("Verifique o nome da sua regra inicial ou edite ROOT_CANDIDATES em Main.java.");
            System.exit(2);
        }

        // imprime qual método/rule foi usado
        System.out.println("Regra raiz invocada: " + usedMethod.getName());

        // imprime a árvore sintática em forma de string com nomes das regras
        System.out.println("Árvore sintática (formato Lisp):");
        System.out.println(Trees.toStringTree(tree, (Parser) parser));
    }
}
