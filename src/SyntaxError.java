import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class SyntaxError extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.err.println(String.format("<%d:%d> Error sintactico: se encontro: '%s'; se esperaba: %s",line,charPositionInLine+1,e.getOffendingToken().getText(),e.getExpectedTokens().toString(recognizer.getVocabulary())).replace("{","").replace("}",""));
        System.exit(-1);
    }
}
