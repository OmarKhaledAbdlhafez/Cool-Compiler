lexer grammar CoolLexer;


INTEGER	: [0-9]+ ;
STRING	: '"' .*? '"';


AT  		: '@' ;
COLON		: ':' ;
COMMA		: ',' ;
DIVIDE		: '/' ;
DOT			: '.' ;
EQUALS		: '=' ;
LARROW      : '<-';
LBRACE		: '{' ;
LE			: '<=';
LPAREN		: '(' ;
LT			: '<' ;
MINUS		: '-' ;
PLUS		: '+' ;
RARROW      : '->';
RBRACE      : '}' ;
RPAREN		: ')' ;
SEMICOLON   : ';' ;
TIMES		: '*' ;
TILDE		: '~' ;



TRUE	    : 't' ('r'|'R') ('u'|'U') ('e'|'E') ;
FALSE	    : 'f' ('a'|'A') ('l'|'L') ('s'|'S') ('e'|'E') ;

CASE        : ('c'|'C') ('a'|'A') ('s'|'S') ('e'|'E') ;
CLASS		: ('c'|'C') ('l'|'L') ('a'|'A') ('s'|'S') ('s'|'S') ;
ELSE		: ('e'|'E') ('l'|'L') ('s'|'S') ('e'|'E') ;
ESAC		: ('e'|'E') ('s'|'S') ('a'|'A') ('c'|'C') ;
FI			: ('f'|'F') ('i'|'I') ;
IF			: ('i'|'I') ('f'|'F') ;
IN			: ('i'|'I') ('n'|'N') ;
INHERITS	: ('i'|'I') ('n'|'N') ('h'|'H') ('e'|'E') ('r'|'R') ('i'|'I') ('t'|'T') ('s'|'S') ;
ISVOID		: ('i'|'I') ('s'|'S') ('v'|'V') ('o'|'O') ('i'|'I') ('d'|'D') ;
LET			: ('l'|'L') ('e'|'E') ('t'|'T') ;
LOOP		: ('l'|'L') ('o'|'O') ('o'|'O') ('p'|'P') ;
NEW			: ('n'|'N') ('e'|'E') ('w'|'W') ;
NOT			: ('n'|'N') ('o'|'O') ('t'|'T') ;
OF			: ('o'|'O') ('f'|'F') ;
POOL		: ('p'|'P') ('o'|'O') ('o'|'O') ('l'|'L') ;
THEN		: ('t'|'T') ('h'|'H') ('e'|'E') ('n'|'N') ;
WHILE		: ('w'|'W') ('h'|'H') ('i'|'I') ('l'|'L') ('e'|'E') ;

TYPE		: [A-Z] [a-zA-Z0-9_]* ;
IDENTIFIER	: [a-z] [a-zA-Z0-9_]* ;

WS			: [ \t\r\n]+ -> skip ;


ERROR		: . ;
