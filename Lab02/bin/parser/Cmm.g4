grammar Cmm;	

program: 
       ;
  		 
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