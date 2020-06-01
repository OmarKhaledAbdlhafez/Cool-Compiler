import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class controller {
    private CoolRulesLexer lexer;
    private CommonTokenStream tokensStream;
    private List<Token> tokens;
    private List<Token> outErrors;
    private List<Token> outTokens;
    CoolRulesParser parser;
    /**
     * This method creates an object of the controller.java class
     */
    public static void main(String[] args) throws IOException{
        //to test with cmd
        /*if(args.length >= 1){
            controller lexicalObj = new controller(args[0]);
        }
        else{
            System.out.println("Please input the name of the file!");
        }*/
        //to test within the ide
        controller lexicalObj = new controller("good.cl");
    }

    /**
     * @param fileName
     */
    public controller(String fileName) {
        // start lexing the file
        startLexing(fileName);
        // start parsing the file
        startParsing(fileName);
    }

    /**
     * @param fileName
     */
    public void startLexing(String fileName){
        CharStream charStream;
        //get char stream from file
        try{
            charStream = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // create lexer from charStream
        lexer = new CoolRulesLexer(charStream);
        // create tokensStream from lexer
        tokensStream = new CommonTokenStream(lexer);
        tokensStream.fill();
        // get tokens from tokensStream
        tokens = tokensStream.getTokens();
        // two empty ArrayLists to save Tokens & errors
        outTokens = new ArrayList();
        outErrors = new ArrayList();
        // get rule names of the lexer
        String[] ruleNames = lexer.getRuleNames();
        // loop over the tokens
        for(Token token:tokens){                    //separating error tokens from out tokens
            if(token.getType()>0){      //means it'snot EOF
                // get the type number of a token
                int tokenTypeNUM = token.getType()-1;
                // check for Error
                if(ruleNames[tokenTypeNUM].equals("ERROR")){
                    // if the rule name of the number is ERROR, add the error token to outErrors ArrayList
                    outErrors.add(token);
                }
                else{// if not error, add the token to the outTokens ArrayList
                    outTokens.add(token);
                }
            }
        }   // finished separation
        // Check for Errors
        if (!outErrors.isEmpty()){
            // If there were Errors, print them
            printErrors();
        }
        else{// if there were no errors, write the tokens in file
            writetokens(fileName+"-lex");
        }
    }

    /**
     * @param fileName
     */
    public void startParsing(String fileName) {
        // create a parser from the tokensStream
        parser = new CoolRulesParser(tokensStream);
        // remove all error listeners of the parser
        parser.removeErrorListeners();
        // add a specific listener (parseErrorListener) for the parser
        parser.addErrorListener(new ParseErrorListener());
        // create a parse tree of the program grammar
        ParseTree pr = parser.program();
        // put the parse tree of the parser object in a string
        String parsTree = pr.toStringTree(parser);
        // write the parse tree in a file
        writeParseTree(fileName+"-cst", parsTree);
    }

    /**
     *
     */
    public void printErrors(){
        // create a string builder for the errors
        StringBuilder outString = new StringBuilder();
        // loop over tokens that have errors
        for(Token error:outErrors){
            // add the error data to the builder
            outString.append(
                    String.format("ERROR: %d: Lexer: invalid character: %s\n",
                            error.getLine(),error.getText()));
        }
        // throw exception with the errors found
        throw new RuntimeException(outString.toString());
    }

    /**
     *
     * @param outFile
     */
    public void writetokens(String outFile){
        try {
            // create a writer to write in a file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            // get rule names of the lexer
            String[] ruleNames = lexer.getRuleNames();
            // loop over tokens
            for (Token token : outTokens) {
                // get the type number of a token
                int tokenTypeNUM = token.getType()-1;
                // write the line number of a token
                writer.write(Integer.toString(token.getLine()) + "\n");
                // write the token type name
                writer.write(ruleNames[tokenTypeNUM] + "\n");
                // check the token for specific type
                if(ruleNames[tokenTypeNUM].equals("INTEGER") ||
                        ruleNames[tokenTypeNUM].equals("STRING") ||
                        ruleNames[tokenTypeNUM].equals("TYPE") ||
                        ruleNames[tokenTypeNUM].equals("IDENTIFIER"))
                    // if it was of those types, print their text
                    writer.write(token.getText() + "\n");
            }
            // close the file
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param outFile
     * @param parseTree
     */
    public void writeParseTree(String outFile, String parseTree){
        try {
            // create a writer to write in a file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            // write the parse tree in the file
            writer.write(parseTree);
            // close the file
            writer.close();
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
