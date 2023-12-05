
grammar Atres;

programa: PROGRAMA ID AB_CHAVE
			declaracao*
			comando*
		  FC_CHAVE;

declaracao: var_decl | var_atrib;

var_decl: TIPO 	ID  PV;

var_atrib:
		 (TIPO)? ID OP_ATRIB (variavel|exprMat) PV;


comando: cmdEntrada
		|cmdSaida
		|cmdCondicao
		|cmdRept
		|var_atrib
		|exprMat PV
		;

cmdEntrada: ID OP_ATRIB ENTRADA PV;

cmdSaida:  ESCREVA AB_PAR string FC_PAR PV;

cmdCondicao: SE AB_PAR comparacao FC_PAR AB_CHAVE comando* FC_CHAVE
            (SENAO SE AB_PAR comparacao FC_PAR AB_CHAVE comando* FC_CHAVE)?
            (SENAO AB_CHAVE comando* FC_CHAVE)?;

comparacao: variavel OP_RELAC variavel;

variavel: ID| INTEIRO_DEF| RACIONAL_DEF| BOOLEAN_DEF | string;

string: STRING_DEF (OP_SOMA (STRING_DEF| ID))*;

cmdRept: for | while;

while: WHILE AB_PAR comparacao FC_PAR AB_CHAVE comando* FC_CHAVE;

for: FOR AB_PAR (TIPO ID OP_ATRIB INTEIRO_DEF| ID) PV comparacao PV ID OP_ATRIB exprMat FC_PAR AB_CHAVE comando* FC_CHAVE;

exprMat: (OP_SOMA | OP_SUB) number
       | exprMat (OP_SOMA| OP_SUB|OP_MULT| OP_DIV) exprMat
       | number (OP_SOMA OP_SOMA| OP_SUB OP_SUB)
       | number ;

number: ID | INTEIRO_DEF | RACIONAL_DEF | AB_PAR exprMat FC_PAR;


////---------------------------------------------------------------------------------------------
////---------------------------- ANALISE LEXICA ---------------------------------------

PROGRAMA: 'programa';
INICIO: 'inicio';
fragment INTEIRO: 'inteiro';
fragment RACIONAL: 'racional';
fragment STRING: 'string';
fragment BOOLEAN: 'boolean';
TIPO: INTEIRO| RACIONAL |STRING| BOOLEAN;
ESCREVA: 'escreva';
ENTRADA: 'entrada';
DECLARAR: 'declaracao';
SE: 'se';
SENAO: 'senao';
WHILE: 'while';
FOR: 'for';
FIM: 'fim';

STRING_DEF: '"' ~'"'* '"';
INTEIRO_DEF: [0-9]+;
RACIONAL_DEF: INTEIRO_DEF+ '.' INTEIRO_DEF+;
BOOLEAN_DEF: 'true' | 'false';

OP_ATRIB: '=';
OP_SOMA: '+';
OP_SUB:  '-';
OP_MULT: '*';
OP_DIV:	'/';

BOOL_E: 'e';
BOOL_OU: 'ou';

OP_RELAC:  '<'|'>'|'<='|'>='|'=='|'!=';

AB_PAR: '(';
FC_PAR: ')';
AB_CHAVE: '{';
FC_CHAVE: '}';
PV: ';';

COMENTARIO: '#' -> skip;

ID:[A-Za-z]+;
NUM_INT: [0-9]+;
NUM_REAL: [0-9]+ ('.' [0-9]*)?;
WS: [ \t\r\n]+ -> skip;