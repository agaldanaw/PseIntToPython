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

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer
            PseIntGrammarParser parser = new PseIntGrammarParser(tokens);
            ParseTree tree = parser.programa(); // begin parsing at init rule

            System.out.println(tree.toStringTree(parser));

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(new PythonTranslate(), tree);
            System.out.println(); // print a \n after translation
        }
        catch (Exception e)
        {
            System.err.println(e);
            System.exit(-1);
        }

    }
}
