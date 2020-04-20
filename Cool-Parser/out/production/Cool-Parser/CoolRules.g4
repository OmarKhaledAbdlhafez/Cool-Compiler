grammar CoolRules;
import CoolLexer;
 
program: (classDefinition)+EOF;

classDefinition: CLASS TYPE (INHERITS TYPE)? LBRACE body RBRACE SEMICOLON;
body: (method  | attr )*  ;

attr: IDENTIFIER COLON TYPE ( LARROW stmt)? SEMICOLON;
method: IDENTIFIER LPAREN (parameter (COMMA parameter)* )? RPAREN COLON TYPE LBRACE stmt RBRACE SEMICOLON;
parameter: IDENTIFIER COLON TYPE;

stmt:stmt(AT TYPE)?DOT IDENTIFIER LPAREN(stmt (COMMA stmt)*)? RPAREN //calling a method of an object or class(static method)   Added
    |IDENTIFIER LPAREN (stmt (COMMA stmt)*)?  RPAREN                //  #method call              Added
    |IF stmt THEN  stmt (ELSE stmt)? FI                             //  # conditions              Done
    |WHILE stmt LOOP stmt POOL                                      //  # loops                   Done
    |LBRACE (stmt SEMICOLON)+ RBRACE                                //  # block                   Done
    |LET (IDENTIFIER COLON TYPE (LARROW stmt)?)+ IN stmt            //  # let statement           Done
    | CASE stmt OF (IDENTIFIER COLON TYPE '=>' stmt SEMICOLON)+ ESAC//  # case statement          Done
    |NEW TYPE                                                       //  # new stmt                Done
    |ISVOID stmt                                                    //  # isvoidstmt              Done
    |TILDE stmt                                                     //  # tilde statement         Done
    |stmt MULDIV stmt                                               //  # mul|div statement       Added
    |stmt PLUSMIN stmt                                              //  # plus|min statement      Added
    |stmt op stmt                                                   //  # expressions             changed
    |NOT stmt                                                       //  #not statement            Added
    |LPAREN stmt RPAREN                                             //  # (stmt)                  Done
    |IDENTIFIER                                                     //  # identifier              Done
    |INTEGER                                                        //  # int                     Done
    |STRING                                                         //  #string                   Done
    |TRUE
    |FALSE
    |IDENTIFIER LARROW stmt                                         //  # assignment              Done
    ;

op:	LT|LE|EQUALS;
MULDIV      :TIMES|DIVIDE;                                          //  #for percidence issues    Added
PLUSMIN     :PLUS|MINUS;                                           //   #for percidence issues    Added
