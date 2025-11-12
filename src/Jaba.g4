grammar Jaba;

// ---------- Parser rules  ----------
programa
    : (declaracao | comando)* EOF
    ;

declaracao
    : tipo ID ';'                              #DeclaracaoSimples
    | tipo ID '=' expressao ';'                #DeclaracaoComInicializacao
    ;

comando
    : atribuicao
    | condicional
    | repeticao
    | entrada
    | saida
    ;

tipo
    : INT
    | REAL
    | BOOL
    ;

atribuicao
    : ID '=' expressao ';'
    ;

condicional
    : IF '(' expressao ')' bloco (ELSE bloco)?
    ;

repeticao
    : WHILE '(' expressao ')' bloco
    ;

bloco
    : '{' (declaracao | comando)* '}'
    ;

entrada
    : LEIA '(' ID ')' ';'
    ;

saida
    : ESCREVA '(' expressao ')' ';'
    ;

// Expressões com precedência correta
expressao
    : expressaoLogica
    ;

expressaoLogica
    : expressaoRelacional (E_LOGICO | OU_LOGICO) expressaoRelacional*
    | expressaoRelacional
    ;

    expressaoRelacional
        : expressaoAritmetica (MAIOR | MENOR | IGUAL | DIFERENTE | MAIORIGUAL | MENORIGUAL) expressaoAritmetica
        | expressaoAritmetica
        ;

    expressaoAritmetica
        : expressaoAritmetica ('+'|'-') termo
        | termo
        ;

termo
    : termo ('*'|'/') fator
    | fator
    ;

fator
    : '(' expressao ')'
    | NUMERO
    | BOOL_LITERAL
    | ID
    ;

// ---------- Lexer rules ----------
INT     : 'inteiro' ;
REAL    : 'real' ;
BOOL    : 'booleano' ;

IF      : 'se' ;
ELSE    : 'senao' ;
WHILE   : 'enquanto' ;

LEIA    : 'leia' ;
ESCREVA : 'escreva' ;

// Literais e identificadores
NUMERO  : [0-9]+ ('.' [0-9]+)? ;
BOOL_LITERAL : 'verdadeiro' | 'falso' ;
ID      : [a-zA-Z_] [a-zA-Z_0-9]* ;

// Símbolos
SEMI    : ';' ;
ASSIGN  : '=' ;
LPAREN  : '(' ;
RPAREN  : ')' ;
LBRACE  : '{' ;
RBRACE  : '}' ;

// Descartar espaços em branco, tabs, comentários
WS : [ \t\r\n]+ -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;

// Operadores relacionais
MAIOR       : '>' ;
MENOR       : '<' ;
IGUAL       : '==' ;
DIFERENTE   : '!=' ;
MAIORIGUAL  : '>=' ;
MENORIGUAL  : '<=' ;

// Operadores lógicos
E_LOGICO    : '&&' ;
OU_LOGICO   : '||' ;
