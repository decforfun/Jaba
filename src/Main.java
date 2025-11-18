// Main.java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;

import javax.swing.*;
import java.lang.reflect.Method;
import java.nio.file.*;
import java.util.*;

public class Main {

    private static final String LEXER_CLASS = "JabaLexer";
    private static final String PARSER_CLASS = "JabaParser";

    private static final String[] ROOT_CANDIDATES = {
            "programa", "program", "prog", "start", "file"
    };

    // separador entre testes no arquivo
    private static final String DELIMITER = "---";

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Uso: java Main <arquivo.jaba>");
            System.exit(1);
        }

        // lê conteúdo inteiro
        String content = Files.readString(Path.of(args[0]));

        // separa os blocos pelo delimitador
        String[] testes = content.split("(?m)^\\s*" + DELIMITER + "\\s*$");

        System.out.println("✔ Total de testes encontrados: " + testes.length);
        System.out.println("========================================\n");

        int index = 1;

        for (String teste : testes) {
            String codigo = teste.trim();
            if (codigo.isEmpty()) continue;

            System.out.println("====== TESTE #" + index + " =======");
            System.out.println(codigo);
            System.out.println("------------------------------");

            processarTrecho(codigo, index);

            System.out.println("\n");
            index++;
        }
    }

    private static void processarTrecho(String codigo, int index) throws Exception {

        CharStream input = CharStreams.fromString(codigo);

        // Instancia o Lexer
        Class<?> lexerClass = Class.forName(LEXER_CLASS);
        Lexer lexer = (Lexer) lexerClass
                .getConstructor(CharStream.class)
                .newInstance(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Instancia o Parser
        Class<?> parserClass = Class.forName(PARSER_CLASS);
        Parser parser = (Parser) parserClass
                .getConstructor(TokenStream.class)
                .newInstance(tokens);

        try { parser.removeErrorListeners(); } catch (Exception ignored) {}
        parser.addErrorListener(new DiagnosticErrorListener());

        // tenta encontrar uma regra inicial automaticamente
        ParseTree tree = null;
        Method usada = null;

        for (String rule : ROOT_CANDIDATES) {
            try {
                Method m = parserClass.getMethod(rule);
                Object r = m.invoke(parser);
                if (r instanceof ParseTree) {
                    tree = (ParseTree) r;
                    usada = m;
                    break;
                }
            } catch (NoSuchMethodException ignored) {}
        }

        if (tree == null) {
            System.err.println("Nenhuma regra raiz encontrada!");
            return;
        }

        // imprime qual regra foi detectada
        System.out.println("Regra raiz: " + usada.getName());

        // imprime árvore textual (pode deixar só para debug)
        System.out.println("Árvore sintática (texto):");
        System.out.println(Trees.toStringTree(tree, parser));

        // ================================
        // VISUALIZAÇÃO GRÁFICA DO ANTLR
        // ================================

        TreeViewer viewer = new TreeViewer(
                Arrays.asList(parser.getRuleNames()),
                tree
        );

        viewer.setScale(1.4); // zoom

        JFrame frame = new JFrame("Árvore Sintática - Teste " + index);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // scroll + viewer
        JScrollPane scroll = new JScrollPane(viewer);
        frame.add(scroll);

        frame.setSize(900, 700);
        frame.setLocationRelativeTo(null); // centraliza
        frame.setVisible(true);
    }
}
