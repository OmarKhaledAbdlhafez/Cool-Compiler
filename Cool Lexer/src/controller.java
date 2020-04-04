import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
//import org.antlr.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class controller {
    private CoolLexer lexer;
    private CommonTokenStream tokensStream;
    private List<Token> tokens;
    private List<Token> outErrors;
    private List<Token> outTokens;

    public static void main(String[] args) throws IOException{
        /*
        if(args.length >= 1){
            controller lexicalObj = new controller(args[0]);
        }
        else{
            System.out.println("Please input the name of the file!");
        }*/
        controller lexicalObj = new controller("bad.cl");
    }

    public controller(String fileName) {
        CharStream charStream;
        try{
            charStream = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lexer = new CoolLexer(charStream);
        tokensStream = new CommonTokenStream(lexer);
        tokensStream.fill();
        tokens = tokensStream.getTokens();
        startLexing(fileName);
    }

    public void startLexing(String fileName){
        outTokens = new ArrayList();
        outErrors = new ArrayList();
        String[] ruleNames = lexer.getRuleNames();
        for(Token token:tokens){                    //separating error tokens from out tokens
            if(token.getType()>0){      //means it'snot EOF
                int tokenTypeNUM = token.getType()-1;
                if(ruleNames[tokenTypeNUM].equals("ERROR")){
                    outErrors.add(token);
                }
                else{
                    outTokens.add(token);
                }
            }
        }
        if (!outErrors.isEmpty()){
            printErrors();
        }
        else{
            writetokens(fileName);
        }
    }

    public void printErrors(){
        StringBuilder outString = new StringBuilder();
        for(Token error:outErrors){
            outString.append(
                    String.format("ERROR: %d: Lexer: invalid character: %s\n",
                            error.getLine(),error.getText()));
        }
        throw new RuntimeException(outString.toString());
    }

    public void writetokens(String outFile){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile+"-lex"));
            String[] ruleNames = lexer.getRuleNames();
            for (Token token : outTokens) {
                int tokenTypeNUM = token.getType()-1;
                writer.write(Integer.toString(token.getLine()) + "\n");
                writer.write(ruleNames[tokenTypeNUM] + "\n");
                if(ruleNames[tokenTypeNUM].equals("INTEGER") ||
                        ruleNames[tokenTypeNUM].equals("STRING") ||
                        ruleNames[tokenTypeNUM].equals("TYPE") ||
                        ruleNames[tokenTypeNUM].equals("IDENTIFIER"))
                    writer.write(token.getText() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
