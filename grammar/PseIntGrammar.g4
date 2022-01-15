grammar PseIntGrammar;

programa: (subproceso)* TOKEN_INICIOPROCESO ID comandos TOKEN_FINPROCESO ;
subproceso: TOKEN_INICIOSUBPROCESO id_subproceso comandos TOKEN_FINSUBPROCESO ;
id_subproceso: ID | ID TOKEN_ASIGNACION ID TOKEN_PARIZQ arg (TOKEN_COMA arg)* TOKEN_PARDER ;
arg: INT | DOUBLE | ID;
comandos: (definicion_variables)* (asignacion_variable)* (comandos_especiales)* (comando_escribir)* (comando_leer)* ;
//comandos
definicion_variables: TOKEN_DEFINIR ID (TOKEN_COMA ID)* TOKEN_COMO TOKEN_TIPO TOKEN_PUNTOYCOMA ;

asignacion_variable: ID TOKEN_ASIGNACION asignacion TOKEN_PUNTOYCOMA ;
asignacion: expresion | INT | DOUBLE | STRING ;
expresion: term ((TOKEN_MAS | TOKEN_MENOS) term)* ;
term: factor ((TOKEN_MUL | TOKEN_DIV) factor)* ;
factor: INT | DOUBLE | ID | TOKEN_PARIZQ expresion TOKEN_PARDER | STRING;

comandos_especiales: TOKEN_COMANDOESPECIAL ID (TOKEN_COMA ID)* TOKEN_PUNTOYCOMA ;
comando_escribir: TOKEN_COMANDOESCRIBIR expresion (TOKEN_COMA expresion)* TOKEN_PUNTOYCOMA ;
comando_leer: TOKEN_COMANDOLEER ID (TOKEN_COMA ID)* TOKEN_PUNTOYCOMA ;

dimensionamiento_arreglo: TOKEN_COMANDODIMENSION ID TOKEN_CORIZQ INT TOKEN_CORDER TOKEN_PUNTOYCOMA ;

//palabras reservadas
TOKEN_INICIOPROCESO: 'proceso' | 'algoritmo';
TOKEN_FINPROCESO: 'finproceso' | 'finalgoritmo';
TOKEN_INICIOSUBPROCESO: 'SubProceso';
TOKEN_FINSUBPROCESO: 'FinSubProceso' ;
TOKEN_DEFINIR: 'definir';
TOKEN_COMO: 'como';
TOKEN_TIPO: 'real' | 'texto' | 'numerico'| 'entero' | 'numero' | 'logico' | 'caracter' | 'cadena' ;
TOKEN_COMANDOESPECIAL: 'borrar pantalla' | 'esperar x segundos' | 'esperar tecla' ;
TOKEN_COMANDOLEER: 'Leer' ;
TOKEN_COMANDOESCRIBIR: 'Escribir' ;
TOKEN_COMANDODIMENSION: 'Dimension' ;
VERDADERO: 'verdadero';
FALSE: 'falso';
PARA: 'Para';
QUE: 'Que';
HASTA: 'Hasta';
CON: 'Con';
PASO: 'Paso';
HACER: 'Hacer';
FINPARA: 'FinPara';
SI: 'Si';
ENTONCES: 'Entonces';
SINO: 'Sino';
FINSI: 'FinSi';
SEGUN: 'Segun';
DE: 'De';
OTRO: 'otro';
CASO: 'caso';
MODO: 'modo';
FINSEGUN: 'FinSegun';
MIENTRAS: 'Mientras';
FINMIENTRAS: 'FinMientras';
REPETIR: 'Repetir';
FUNCION: 'Funcion';
FINFUNCION: 'FinFuncion';
LIMPIAR: 'limpiar';
MOD: 'mod';
NO: 'no';
O: 'o';
Y:'y';

//token
TOKEN_MAS: '+';
TOKEN_MENOS: '-';
TOKEN_MUL: '*';
TOKEN_DIV: '/';
TOKEN_PARIZQ: '(';
TOKEN_PARDER: ')';
TOKEN_CORIZQ: '[';
TOKEN_CORDER: ']';
TOKEN_MOD: '%';
TOKEN_IGUAL: '=';
TOKEN_IGUALDAD: '==';
TOKEN_DIFERENTE: '!=';
TOKEN_MENOR: '<';
TOKEN_MENORIGUAL: '<=';
TOKEN_MAYOR: '>';
TOKEN_MAYORIGUAL: '>=';

TOKEN_COMA: ',';
TOKEN_PUNTOYCOMA: ';';
TOKEN_COMILLAS: '"';
TOKEN_ASIGNACION: '<-';

TOKEN_NEG: '~';
TOKEN_COMENTARIO: '//';
TOKEN_O: '|';
TOKEN_Y: '&';
TOKEN_POT: '^';


INT: [0-9]+ ;
DOUBLE: [0-9]+ '.' [0-9]+ ;
STRING: TOKEN_COMILLAS [a-zA-Z0-9_ ]* TOKEN_COMILLAS ;
//VAR: [a-zA-Z_]+ ;
ID: [a-zA-Z_][a-zA-Z0-9_]* ;
SPACE : [ \t\r\n]+ -> skip ;







