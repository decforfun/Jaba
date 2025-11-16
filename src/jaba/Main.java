package jaba;

import jaba.JabaLexer;
import jaba.JabaParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String codigo = """
            inteiro x;
            x = 5;
            escreva(x);
        """;

        CharStream cs = CharStreams.fromString(codigo);
        JabaLexer lexer = new JabaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JabaParser parser = new JabaParser(tokens);

        ParseTree tree = parser.programa();

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
