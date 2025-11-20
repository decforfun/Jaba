import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvalVisitor extends JabaBaseVisitor<Object> {

    // tipo da variável: "inteiro", "real", "booleano"
    private final Map<String, String> tipos = new HashMap<>();
    // valor atual da variável
    private final Map<String, Object> memoria = new HashMap<>();

    private final Scanner scanner = new Scanner(System.in);

    // --------------------------------------------------
    // programa
    // --------------------------------------------------
    @Override
    public Object visitPrograma(JabaParser.ProgramaContext ctx) {
        Object last = null;
        for (ParseTree child : ctx.children) {
            last = visit(child);
        }
        return last;
    }

    // --------------------------------------------------
    // declarações
    // declaracao
    //     : tipo ID ';'                              #DeclaracaoSimples
    //     | tipo ID '=' expressao ';'                #DeclaracaoComInicializacao
    // --------------------------------------------------

    @Override
    public Object visitDeclaracaoSimples(JabaParser.DeclaracaoSimplesContext ctx) {
        String tipo = ctx.tipo().getText();   // "inteiro" | "real" | "booleano"
        String id   = ctx.ID().getText();

        tipos.put(id, tipo);

        // valor default
        switch (tipo) {
            case "inteiro":
                memoria.put(id, 0);
                break;
            case "real":
                memoria.put(id, 0.0);
                break;
            case "booleano":
                memoria.put(id, false);
                break;
        }
        return null;
    }

    @Override
    public Object visitDeclaracaoComInicializacao(JabaParser.DeclaracaoComInicializacaoContext ctx) {
        String tipo = ctx.tipo().getText();
        String id   = ctx.ID().getText();

        tipos.put(id, tipo);

        Object valor = visit(ctx.expressao());
        valor = castToType(valor, tipo);

        memoria.put(id, valor);
        return null;
    }

    // --------------------------------------------------
    // atribuição
    // atribuicao : ID '=' expressao ';'
    // --------------------------------------------------
    @Override
    public Object visitAtribuicao(JabaParser.AtribuicaoContext ctx) {
        String id = ctx.ID().getText();
        Object valor = visit(ctx.expressao());

        String tipo = tipos.get(id); // pode ser null se não declarado (não recomendado)
        if (tipo != null) {
            valor = castToType(valor, tipo);
        }

        memoria.put(id, valor);
        return null;
    }

    // --------------------------------------------------
    // entrada: leia(ID);
    // --------------------------------------------------
    @Override
    public Object visitEntrada(JabaParser.EntradaContext ctx) {
        String var = ctx.ID().getText();
        String tipo = tipos.get(var);

        System.out.print("Digite o valor de " + var + ": ");
        String texto = scanner.nextLine().trim();

        Object valor;

        if ("booleano".equals(tipo)) {
            // espera "verdadeiro" ou "falso"
            if (!texto.equals("verdadeiro") && !texto.equals("falso")) {
                throw new RuntimeException("Valor inválido para booleano: " + texto);
            }
            valor = texto.equals("verdadeiro");
        } else if ("real".equals(tipo)) {
            // real
            valor = Double.parseDouble(texto.replace(',', '.')); // aceita vírgula também
        } else {
            // inteiro ou tipo desconhecido -> tenta inteiro
            valor = Integer.parseInt(texto);
        }

        memoria.put(var, valor);
        return null;
    }

    // --------------------------------------------------
    // saída: escreva(expr);
    // --------------------------------------------------
    @Override
    public Object visitSaida(JabaParser.SaidaContext ctx) {
        Object v = visit(ctx.expressao());
        System.out.println(v);
        return null;
    }

    // --------------------------------------------------
    // condicional: se (expr) bloco (senao bloco)?
    // --------------------------------------------------
    @Override
    public Object visitCondicional(JabaParser.CondicionalContext ctx) {
        boolean cond = toBoolean(visit(ctx.expressao()));

        if (cond) {
            visit(ctx.bloco(0));
        } else if (ctx.ELSE() != null) {  // existe senao
            visit(ctx.bloco(1));
        }
        return null;
    }

    // --------------------------------------------------
    // repeticao: enquanto (expr) bloco
    // --------------------------------------------------
    @Override
    public Object visitRepeticao(JabaParser.RepeticaoContext ctx) {
        while (toBoolean(visit(ctx.expressao()))) {
            visit(ctx.bloco());
        }
        return null;
    }

    // --------------------------------------------------
    // bloco: { (declaracao | comando)* }
    // --------------------------------------------------
    @Override
    public Object visitBloco(JabaParser.BlocoContext ctx) {
        for (ParseTree child : ctx.children) {
            // ignora { e }
            if (child instanceof JabaParser.DeclaracaoContext ||
                    child instanceof JabaParser.ComandoContext) {
                visit(child);
            }
        }
        return null;
    }

    // --------------------------------------------------
    // expressão
    // expressao : expressaoLogica ;
    // --------------------------------------------------
    @Override
    public Object visitExpressao(JabaParser.ExpressaoContext ctx) {
        return visit(ctx.expressaoLogica());
    }

    // --------------------------------------------------
    // expressaoLogica
    //   : expressaoRelacional (E_LOGICO | OU_LOGICO) expressaoRelacional*
    //   | expressaoRelacional
    // --------------------------------------------------
    @Override
    public Object visitExpressaoLogica(JabaParser.ExpressaoLogicaContext ctx) {
        int n = ctx.expressaoRelacional().size();
        if (n == 1) {
            return visit(ctx.expressaoRelacional(0));
        }

        // tem operador lógico
        boolean result = toBoolean(visit(ctx.expressaoRelacional(0)));

        String op = ctx.E_LOGICO() != null ? "&&" : "||";

        for (int i = 1; i < n; i++) {
            boolean next = toBoolean(visit(ctx.expressaoRelacional(i)));
            if (op.equals("&&")) {
                result = result && next;
            } else {
                result = result || next;
            }
        }

        return result;
    }

    // --------------------------------------------------
    // expressaoRelacional
    //   : expressaoAritmetica (MAIOR | MENOR | IGUAL | DIFERENTE | MAIORIGUAL | MENORIGUAL) expressaoAritmetica
    //   | expressaoAritmetica
    // --------------------------------------------------
    @Override
    public Object visitExpressaoRelacional(JabaParser.ExpressaoRelacionalContext ctx) {
        if (ctx.expressaoAritmetica().size() == 1) {
            return visit(ctx.expressaoAritmetica(0));
        }

        Object left  = visit(ctx.expressaoAritmetica(0));
        Object right = visit(ctx.expressaoAritmetica(1));

        String op = null;
        if (ctx.MAIOR() != null) op = ">";
        else if (ctx.MENOR() != null) op = "<";
        else if (ctx.MAIORIGUAL() != null) op = ">=";
        else if (ctx.MENORIGUAL() != null) op = "<=";
        else if (ctx.IGUAL() != null) op = "==";
        else if (ctx.DIFERENTE() != null) op = "!=";

        // == e != podem funcionar com qualquer tipo
        if ("==".equals(op)) {
            if (left == null) return right == null;
            return left.equals(right);
        }
        if ("!=".equals(op)) {
            if (left == null) return right != null;
            return !left.equals(right);
        }

        // demais: tratamos como numéricos
        double a = toDouble(left);
        double b = toDouble(right);

        switch (op) {
            case ">":  return a >  b;
            case "<":  return a <  b;
            case ">=": return a >= b;
            case "<=": return a <= b;
        }
        throw new RuntimeException("Operador relacional desconhecido: " + op);
    }

    // --------------------------------------------------
    // expressaoAritmetica: soma e subtração
    // (usamos os filhos diretamente, funciona mesmo com recursão à esquerda)
    // --------------------------------------------------
    @Override
    public Object visitExpressaoAritmetica(JabaParser.ExpressaoAritmeticaContext ctx) {
        // avaliamos da esquerda pra direita
        Object result = visit(ctx.getChild(0));

        for (int i = 1; i < ctx.getChildCount(); i += 2) {
            String op = ctx.getChild(i).getText(); // '+' ou '-'
            Object right = visit(ctx.getChild(i + 1));
            result = applyAddSub(result, right, op);
        }

        return result;
    }

    // --------------------------------------------------
    // termo: multiplicação e divisão
    // --------------------------------------------------
    @Override
    public Object visitTermo(JabaParser.TermoContext ctx) {
        Object result = visit(ctx.getChild(0));

        for (int i = 1; i < ctx.getChildCount(); i += 2) {
            String op = ctx.getChild(i).getText(); // '*' ou '/'
            Object right = visit(ctx.getChild(i + 1));
            result = applyMulDiv(result, right, op);
        }

        return result;
    }

    // --------------------------------------------------
    // fator
    //   : '(' expressao ')'
    //   | NUMERO
    //   | BOOL_LITERAL
    //   | ID
    // --------------------------------------------------
    @Override
    public Object visitFator(JabaParser.FatorContext ctx) {
        if (ctx.expressao() != null) {
            return visit(ctx.expressao());
        }

        if (ctx.NUMERO() != null) {
            String txt = ctx.NUMERO().getText();
            if (txt.contains(".")) {
                return Double.parseDouble(txt);
            } else {
                return Integer.parseInt(txt);
            }
        }

        if (ctx.BOOL_LITERAL() != null) {
            String txt = ctx.BOOL_LITERAL().getText();
            return txt.equals("verdadeiro");
        }

        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (!memoria.containsKey(id)) {
                throw new RuntimeException("Variável não declarada: " + id);
            }
            return memoria.get(id);
        }

        return null;
    }

    // --------------------------------------------------
    // Funções auxiliares de tipos e operações
    // --------------------------------------------------

    private Object castToType(Object valor, String tipo) {
        if ("inteiro".equals(tipo)) {
            int i = (int) Math.round(toDouble(valor));
            return i;
        } else if ("real".equals(tipo)) {
            return toDouble(valor);
        } else if ("booleano".equals(tipo)) {
            return toBoolean(valor);
        }
        return valor;
    }

    private double toDouble(Object v) {
        if (v instanceof Integer) return ((Integer) v).doubleValue();
        if (v instanceof Double)  return (Double) v;
        if (v instanceof Boolean) return ((Boolean) v) ? 1.0 : 0.0;
        throw new RuntimeException("Valor não numérico: " + v);
    }

    private boolean toBoolean(Object v) {
        if (v instanceof Boolean) return (Boolean) v;
        if (v instanceof Integer) return ((Integer) v) != 0;
        if (v instanceof Double)  return ((Double) v) != 0.0;
        throw new RuntimeException("Valor não booleano: " + v);
    }

    private Object applyAddSub(Object a, Object b, String op) {
        // se os dois são inteiros, mantemos inteiro; se um for real, vira double
        if (a instanceof Integer && b instanceof Integer) {
            int x = (Integer) a;
            int y = (Integer) b;
            return "+".equals(op) ? x + y : x - y;
        } else {
            double x = toDouble(a);
            double y = toDouble(b);
            return "+".equals(op) ? x + y : x - y;
        }
    }

    private Object applyMulDiv(Object a, Object b, String op) {
        if (a instanceof Integer && b instanceof Integer && op.equals("*")) {
            int x = (Integer) a;
            int y = (Integer) b;
            return x * y;
        } else {
            double x = toDouble(a);
            double y = toDouble(b);
            if (op.equals("*")) {
                return x * y;
            } else {
                return x / y;
            }
        }
    }
}
