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
			
varDef: primitiveType idList ';'
		;
		
idList: ID (',' ID)*
		;
		
arrayDef: primitiveType expression ';'
		;	
		
record: 'struct' '{' varDef* '}' ID ';'
		;

primitiveType: 'int'
			|  'char'
			|  'double'
			;

structDef:arrayDef
		| record
		;
		
funcDef: (primitiveType|'void') ID '(' paramList? ')' funcBody 
		;
		
funcBody: '{' varDef*  statement*  '}'
		;
		
main: 'void' 'main''(' ')'  mainBody
		;

mainBody: '{'  varDef* (structDef | statement)* '}'
		;

statement:    loop
			| ifstmnt
			| oneLineStmt
			;
			
oneLineStmt: (funcInvocation 
			| returnStmnt 
			| assignment 
			| io) ';'
			;

loop: 'while' '('expression')' '{' statement* '}'
		;

ifstmnt:   ifword (statement* | '{' statement* '}')
		|  ifword (statement* | '{' statement* '}') 'else' (statement* | '{' statement*'}') 
		;
		
ifword: 'if' '(' expression ')'
		;

returnStmnt: 'return' expression
		;
		
funcInvocation: ID '(' exprList? ')' 
		;
		
paramList: param ( ',' param)*
		;

param: primitiveType ID
		;	 		
		 
expression:   expression.expression
			| cast expression
			| '-' expression
			| '!' expression
			| expression ('*' | '/' | '%') expression
			| expression ('+' | '-' ) expression
			| expression ('>' | '>=' | '<' | '<=' | '!=' | '==') expression   
			| INT_CONSTANT
			| REAL_CONSTANT
			| CHAR_CONSTANT
			| ID
			; 
			
exprList: expression ( ',' expression)*
		;
			
io:   read
	| write
	;
	
read: 'read' exprList 
	;
	
write: 'write' exprList
	;
	
assignment: ID '=' expression
			;

cast: '(' primitiveType ')' 
	;

			
unaryMinus: '-' INT_CONSTANT
			;


			
	
/* LEXICAL RULES */



INT_CONSTANT: '0'
			|[1-9]DIGIT*
            ;
            
REAL_CONSTANT:
			 FIXED_POINT([eE]'-'?DIGIT+)?
			|DIGIT[eE]DIGIT+
			;
 			
ID: ((LETTER|'_'|'-')+[0-9]*)+
			;
			
CHAR_CONSTANT:'\'' ( LETTER | DIGIT | SPECIAL_CHAR | ASCII) '\''
			
			;

COMMENT: '//'~[\n\r]*  ->skip;
/* comment*/
MULTILINE_COMMENT: '/*'  .*?  '*/' -> skip;

BLANK: [ \n\r\t]+ -> skip;


