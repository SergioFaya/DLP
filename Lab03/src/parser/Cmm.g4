grammar Cmm;	

program: definitions main 
       ;


/*FRAGMENTS*/
fragment DIGIT: [0-9];

fragment LETTER: [a-zA-Z];

fragment FIXED_POINT: DIGIT*'.'DIGIT+ 
					| DIGIT+'.'DIGIT*
					;
			
fragment SPECIAL_CHAR:
			 '\\n'
			|'\\t'
			| '.'
			| '~'
			| '-'
			;
fragment ASCII:  '\\'DIGIT+
			;
/* SINTAX RULES */ 

definitions: (varDef | funcDef)*
			;
			
varDef: type idList ';'
		;
		
idList: ID (',' ID)*
		;

primitiveType: 'int'
			|  'char'
			|  'double'
			;

type: primitiveType
		| arrayDef
		| struct
		;
		
arrayDef: primitiveType dimSize
		;	
dimSize: ('[' INT_CONSTANT ']')+
		;
		
struct: 'struct' '{' '}'
	;
	
funcDef: (primitiveType|'void') ID '(' paramList? ')' '{' '}' 
		;
		
main: 'void' 'main''(' ')' '{'varDef statements'}'
		;

statements:
		;
		
paramList: param ( ',' param)*
		;

param: type ID
	;	 		

statement: assingment
		 ;
		 /*ARTIHMETIC SHOULD BE A EXPRESSION*/
expression:  unaryMinus
			| ID
			| INT_CONSTANT
			; 
			
assingment: expression '=' expression ';'
			;

arithmetic:   expression '*' expression
			| expression '/' expression
			| expression '+' expression
			| expression '-' expression
			| ID
			| INT_CONSTANT
			| REAL_CONSTANT
			;
			
unaryMinus: '-' INT_CONSTANT
			;


			
	
/* LEXICAL RULES */



INT_CONSTANT: '0'
			|[1-9]DIGIT+
            ;
            
REAL_CONSTANT:
			 FIXED_POINT([eE]'-'?DIGIT+)?
			|DIGIT[eE]DIGIT+
			;
 			
ID: ((LETTER|'_'|'-')+[0-9]*)+
			;
			
CHAR_CONSTANT:'\'' LETTER '\''
			| '\'' DIGIT '\''
			| '\'' SPECIAL_CHAR '\''
			| '\'' ASCII '\''
			;

COMMENT: '//'~[\n\r]*  ->skip;
/* comment*/
MULTILINE_COMMENT: '/*'  .*?  '*/' -> skip;

BLANK: [ \n\r\t]+ -> skip;


