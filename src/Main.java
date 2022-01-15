import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/*
* Presentado por:
*           - Andres Ortega
*           - Andres Aldana Wilches
*  Nos basamos en la sintaxis presentada en: http://pseint.sourceforge.net/index.php?page=pseudocodigo.php
* */
public class Main {
    public static void main(String[] args) {
        try
        {
            PseIntGrammarLexer lexer;
            if (args.length>0)
                lexer = new PseIntGrammarLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new PseIntGrammarLexer(CharStreams.fromStream(System.in));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new LexicalError());

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PseIntGrammarParser parser = new PseIntGrammarParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new SyntaxError());

            ParseTree tree = parser.programa();
            System.out.println(tree.toStringTree(parser));
//
//            Translate translate = new Translate();
//            translate.visit(tree);
        }
        catch (Exception e)
        {
            System.err.println(e);
            System.exit(-1);
        }

    }
}
