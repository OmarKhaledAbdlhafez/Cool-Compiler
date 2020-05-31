grammar CoolRules;
import CoolLexer;

program: (classDefinition)+EOF;

classDefinition: CLASS TYPE (INHERITS TYPE)? LBRACE body RBRACE SEMICOLON;
body: (method  | attr )*  ;

attr: IDENTIFIER COLON TYPE ( LARROW stmt)? SEMICOLON;
method: IDENTIFIER LPAREN (parameter (COMMA parameter)* )? RPAREN COLON TYPE LBRACE stmt RBRACE SEMICOLON;
parameter: IDENTIFIER COLON TYPE;

stmt:stmt(AT TYPE)?DOT IDENTIFIER LPAREN(stmt (COMMA stmt)*)? RPAREN    #calling
    |IDENTIFIER LPAREN (stmt (COMMA stmt)*)?  RPAREN                  #methodcall
    |IF stmt THEN  stmt (ELSE stmt)? FI                               # conditions
    |WHILE stmt LOOP stmt POOL                                        # loops
    |LBRACE (stmt SEMICOLON)+ RBRACE                                  # block
    |LET (IDENTIFIER COLON TYPE (LARROW stmt)?)+ IN stmt              # letstatement
    | CASE stmt OF (IDENTIFIER COLON TYPE '=>' stmt SEMICOLON)+ ESAC  #casestatement
    |NEW TYPE                                                         # newstmt
    |ISVOID stmt                                                      # isvoidstmt
    |TILDE stmt                                                       # tildestatement
    |stmt TIMES stmt                                         # expressions
    |stmt DIVIDE stmt                                        # expressions
    |stmt PLUS stmt                                         # expressions
    |stmt MINUS stmt                                        # expressions
    |stmt LT stmt                                           # expressions
    |stmt LE stmt                                           # expressions
    |stmt EQUALS stmt                                       # expressions
    |NOT stmt                                                         #notstatement
    |LPAREN stmt RPAREN                                               #statem
    |IDENTIFIER                                                       #identifier
    |INTEGER                                                          # int
    |STRING                                                           #string
    |IDENTIFIER LARROW stmt                                           # assignment
    ;
