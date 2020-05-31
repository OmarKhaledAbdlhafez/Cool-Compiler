grammar CoolRules;

import CoolLexer;

program: (classDefinition)+EOF;

classDefinition: CLASS TYPE (INHERITS TYPE)? LBRACE body RBRACE SEMICOLON;
body: (method  | attr )*  ;

attr: IDENTIFIER COLON TYPE ( LARROW stmt)? SEMICOLON;
method: IDENTIFIER LPAREN (parameter (COMMA parameter)* )? RPAREN COLON TYPE LBRACE stmt RBRACE SEMICOLON;
parameter: IDENTIFIER COLON TYPE;

stmt:stmt(AT TYPE)?DOT IDENTIFIER LPAREN(stmt (COMMA stmt)*)? RPAREN    # calling
    |IDENTIFIER LPAREN (stmt (COMMA stmt)*)?  RPAREN                    # methodcall
    |IF stmt THEN  stmt (ELSE stmt)? FI                                 # if
    |WHILE stmt LOOP stmt POOL                                          # while
    |LBRACE (stmt SEMICOLON)+ RBRACE                                    # block
    |LET (IDENTIFIER COLON TYPE (LARROW stmt)?)+ IN stmt                # let
    | CASE stmt OF (IDENTIFIER COLON TYPE '=>' stmt SEMICOLON)+ ESAC    # case
    |NEW TYPE                                                           # new
    |ISVOID stmt                                                        # isvoid
    |TILDE stmt                                                         # tilde
    |stmt TIMES stmt                                                    # expr
    |stmt DIVIDE stmt                                                   # expr
    |stmt PLUS stmt                                                     # expr
    |stmt MINUS stmt                                                    # expr
    |stmt LT stmt                                                       # expr
    |stmt LE stmt                                                       # expr
    |stmt EQUALS stmt                                                   # expr
    |NOT stmt                                                           # invert
    |LPAREN stmt RPAREN                                                 # statem
    |IDENTIFIER                                                         # identifier
    |INTEGER                                                            # int
    |STRING                                                             # string
    |IDENTIFIER LARROW stmt                                             # assign
    ;
