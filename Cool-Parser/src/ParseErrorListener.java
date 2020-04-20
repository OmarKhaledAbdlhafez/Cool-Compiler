import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ParseErrorListener extends BaseErrorListener {
    /**
     *
     * @param recognizer
     * @param offendingSymbol
     * @param line
     * @param charPositionInLine
     * @param msg
     * @param e
     * @throws ParseCancellationException
     */
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,int line,
                            int charPositionInLine, String msg, RecognitionException e) throws ParseCancellationException {
        // throw an exception with data about the syntax error
        throw new ParseCancellationException("\nLine "+line+" : "+msg);
    }
}
