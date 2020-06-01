import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "test.cl";

        CharStream charStream = CharStreams.fromFileName(fileName);

        CoolRulesLexer lexer = new CoolRulesLexer(charStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CoolRulesParser parser = new CoolRulesParser(tokens);

        ParseTree tree = parser.program();


        CoolVisitor visitor = new CoolVisitor();
        visitor.visit(tree);
    }
}
