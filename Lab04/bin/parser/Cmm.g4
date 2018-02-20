grammar Cmm;	

@header{
	import ast.program.*;
	import ast.program.expressions.*;
	import ast.program.statements.*;
	import ast.program.types.*;
	import java.util.*;
}

program returns [Program ast]: definitions main 
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
			
/************************ SINTAX RULES ***************************/ 

definitions returns[List<Definition> definitions = new ArrayList<Definition>();]
			: (variable {$definitions.add($variable);}| function{$definitions.add($function);})*
			;

variable: type idList ';'
		;

type:	primitiveType
		| arrayType
		| recordType
		;	

primitiveType: 'int'
			| 'double'
			| 'char'
			;

arrayType: primitiveType ('['INT_CONSTANT']')+
		;
	
recordType: 'struct' '{' variable* '}'
		;
	
idList:   ID 
		| ID (',' ID)+
		;
		
function: ('void'|primitiveType) ID '(' paramList? ')' block
		;
		
paramList:  param
			| param (',' param)+
			;
param:  primitiveType ID
		;
block: '{' variable* stmnt* '}' 
		;
			
stmnt:    ioStmnt
		| assignmentStmnt
		| returnStmnt 
		| ifStmnt
		| whileStmnt
		| functInvocation ';'
		;
		
ioStmnt: ('write'|'read') exp (',' exp)* ';'
	;
	
assignmentStmnt: exp '=' exp ';'
	;
	
returnStmnt: 'return' exp ';'
	;
	
ifStmnt:  'if' '(' exp ')' block
		| 'if' '(' exp ')' block 'else' block
		| 'if' '(' exp ')' variable* stmnt*
		| 'if' '(' exp ')' variable* stmnt* 'else' variable* stmnt*
		;
	
whileStmnt: 'while' '('exp')' block
			;
	
exp:  exp '['exp']'
	| exp '('exp')'
	| exp '.' exp
	| cast exp
	| '-' exp
	| '!' exp
	| exp ('*' | '/' | '%') exp
	| exp ('+' | '-' ) exp
	| exp ('>' | '>=' | '<' | '<=' | '!=' | '==') exp 
	| exp ( '&&' | '||' ) exp 
	| functInvocation
	| ID
	| INT_CONSTANT
	| REAL_CONSTANT
	| CHAR_CONSTANT
	;

cast: '('primitiveType')'
	;

functInvocation: ID '(' expList? ')'
				;

expList: exp (',' exp)*
		;

main: 'void' 'main' '(' ')' block
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


