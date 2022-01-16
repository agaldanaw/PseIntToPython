grammar PseIntGrammar;

programa: (comentario)* (subproceso)* (proceso);
proceso: TOKEN_INICIOPROCESO ID comandos* TOKEN_FINPROCESO;
subproceso: TOKEN_INICIOSUBPROCESO id_subproceso comandos TOKEN_FINSUBPROCESO ;
id_subproceso: ID | ID TOKEN_ASIGNACION funcion;
arg: INT | DOUBLE | ID;
comandos: comando (comando)*;
comando: definicion_variables | asignacion_variable | comandos_especiales |
         comando_escribir | comando_leer | dimensionamiento_arreglo | condicional_si | ciclo_para |
         ciclo_mientras | ciclo_repetirhasta | comando_segunhacer | comentario;

comentario: COMMENT;

definicion_variables: TOKEN_DEFINIR ID (TOKEN_COMA ID)* TOKEN_COMO TOKEN_TIPO TOKEN_PUNTOYCOMA ;

asignacion_variable: ID TOKEN_ASIGNACION asignacion TOKEN_PUNTOYCOMA ;
asignacion:  expresion | INT | DOUBLE | STRING | funcion;
expresion: term ((TOKEN_MAS | TOKEN_MENOS) term)* ;
term: factor ((TOKEN_MUL | TOKEN_DIV) factor)* ;
factor: INT | DOUBLE | ID | TOKEN_PARIZQ expresion TOKEN_PARDER | STRING ;
funcion: ID TOKEN_PARIZQ arg (TOKEN_COMA arg)* TOKEN_PARDER;

comandos_especiales: TOKEN_COMANDOESPECIAL ID (TOKEN_COMA ID)* TOKEN_PUNTOYCOMA ;
comando_escribir: TOKEN_COMANDOESCRIBIR expresion_escribir (coma expresion_escribir)* TOKEN_PUNTOYCOMA ;
comando_leer: TOKEN_COMANDOLEER ID (TOKEN_COMA ID)* TOKEN_PUNTOYCOMA ;
dimensionamiento_arreglo: TOKEN_COMANDODIMENSION ID TOKEN_CORIZQ INT TOKEN_CORDER TOKEN_PUNTOYCOMA ;
coma: TOKEN_COMA;
expresion_escribir: expresion;

condicional_si: SI (TOKEN_PARIZQ)? condicion (TOKEN_PARDER)? ENTONCES comandos condicion_sino FINSI ;
condicion: ID comparacion expresion ((Y | O | TOKEN_O | TOKEN_Y) ID comparacion ID)* ;
comparacion: TOKEN_IGUAL | TOKEN_DIFERENTE | TOKEN_MENOR | TOKEN_MENORIGUAL | TOKEN_MAYOR | TOKEN_MAYORIGUAL ;
condicion_sino: (SINO comandos)?;

ciclo_para: PARA asignacion_para paso? HACER comandos FINPARA ;
ciclo_mientras: MIENTRAS condicion HACER comandos FINMIENTRAS ;
ciclo_repetirhasta: REPETIR comandos HASTA QUE condicion ;
paso: (CON PASO ID TOKEN_MAS INT);
asignacion_para: ID TOKEN_ASIGNACION asignacion HASTA expresion;

comando_segunhacer: SEGUN ID HACER caso (caso)* de_otro_modo? FINSEGUN ;
caso: (CASO expresion TOKEN_DOSPUNTOS comandos);
de_otro_modo: (TOKEN_OTROMODO TOKEN_DOSPUNTOS comandos);

//palabras reservadas
TOKEN_INICIOPROCESO: 'proceso' | 'algoritmo';
TOKEN_FINPROCESO: 'finproceso' | 'finalgoritmo';
TOKEN_INICIOSUBPROCESO: 'subproceso';
TOKEN_FINSUBPROCESO: 'finsubproceso' ;
TOKEN_DEFINIR: 'definir';
TOKEN_COMO: 'como';
TOKEN_TIPO: 'real' | 'texto' | 'numerico'| 'entero' | 'numero' | 'logico' | 'caracter' | 'cadena' ;
TOKEN_COMANDOESPECIAL: 'borrar pantalla' | 'esperar x segundos' | 'esperar tecla' ;
TOKEN_COMANDOLEER: 'leer' ;
TOKEN_COMANDOESCRIBIR: 'escribir' ;
TOKEN_COMANDODIMENSION: 'dimension' ;
TOKEN_OTROMODO: 'de otro modo' ;

VERDADERO: 'verdadero';
FALSE: 'falso';
PARA: 'para';
QUE: 'que';
HASTA: 'hasta';
CON: 'con';
PASO: 'paso';
HACER: 'hacer';
FINPARA: 'finpara';
SI: 'si';
ENTONCES: 'entonces';
SINO: 'sino';
FINSI: 'finsi';
SEGUN: 'segun';
DE: 'de';
OTRO: 'otro';
CASO: 'caso';
MODO: 'modo';
FINSEGUN: 'finsegun';
MIENTRAS: 'mientras';
FINMIENTRAS: 'finmientras';
REPETIR: 'repetir';
FUNCION: 'funcion';
FINFUNCION: 'finfuncion';
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
TOKEN_DIFERENTE: '<>';
TOKEN_MENOR: '<';
TOKEN_MENORIGUAL: '<=';
TOKEN_MAYOR: '>';
TOKEN_MAYORIGUAL: '>=';

TOKEN_COMA: ',';
TOKEN_DOSPUNTOS: ':';
TOKEN_PUNTOYCOMA: ';';
TOKEN_COMILLAS: '"';
TOKEN_ASIGNACION: '<-';

TOKEN_NEG: '~';
TOKEN_COMENTARIO: '//';
TOKEN_O: '|';
TOKEN_Y: '&';
TOKEN_POT: '^';


INT: TOKEN_MENOS?[0-9]+ ;
DOUBLE: [0-9]+ '.' [0-9]+ ;
STRING: TOKEN_COMILLAS [a-zA-Z0-9_ ]* TOKEN_COMILLAS ;
//VAR: [a-zA-Z_]+ ;
ID: [a-zA-Z_][a-zA-Z0-9_]* ;
SPACE : [ \t\r\n]+ -> skip ;
COMMENT: TOKEN_COMENTARIO .*? '\n';
