grammar Cmm;	

@header{
	import ast.*;
	import ast.program.*;
	import ast.program.expressions.*;
	import ast.program.expressions.unary.*;
	import ast.program.expressions.operands.*;
	import ast.program.expressions.literal.*;
	import ast.program.statements.*;
	import ast.program.expstmnt.*;
	import ast.program.types.*;
	import ast.program.types.primitive.*;
	import ast.program.definitions.*;
	import java.util.*;
	import parser.LexerHelper;
}

program returns [Program ast]: definitions main 
		{	
			List<Definition> defs = $definitions.ast;
			defs.add($main.ast);
			$ast = new Program($start.getLine(),$start.getCharPositionInLine()+1,defs);
		} 
       ;

/************************ SINTAX RULES ***************************/ 

definitions returns [List<Definition> ast = new ArrayList<>();]
			locals [List<Definition> aux = new ArrayList<>();]:
			(varDef {
				for(VarDefinition def: $varDef.ast){
					$aux.add(def);
				}
				}
				| funcDef{
					$aux.add($funcDef.ast);
				}
				)*

				{$ast = $aux;}
			;

varDef returns [List<VarDefinition> ast = new ArrayList<>()]:
		type idList ';' 
		{
		for(String str: $idList.ast){
				$ast.add(new VarDefinition($start.getLine(),$start.getCharPositionInLine()+1,$type.ast,str));		
		}
		}
		;

type returns [Type ast]:
		  primitiveType {$ast = $primitiveType.ast;}
		| arrayType  	{$ast = $arrayType.ast;}
		| structType	{$ast = $structType.ast;}
		;	

primitiveType returns [Type ast ]:
			  'int'		{$ast = IntType.getInstance();}
			| 'double'	{$ast = RealType.getInstance();}
			| 'char'	{$ast = CharType.getInstance();}
			;

arrayType returns [ArrayType ast]:
		primitiveType arrayDim
		{$ast = new ArrayType($start.getLine(),$start.getCharPositionInLine()+1,$primitiveType.ast,$arrayDim.ast);}
		;

arrayDim returns [List<Integer> ast = new ArrayList<>();]:
		 ('['INT_CONSTANT']'{$ast.add(Integer.parseInt($INT_CONSTANT.getText()));})+
		;
	
structType returns [StructType ast]
			locals[List<Field> fields = new ArrayList<Field>();]:
		 'struct''{' (field{$fields.add($field.ast);})* '}'
		 {$ast = new StructType($start.getLine(),$start.getCharPositionInLine()+1,$fields);}
		;
	
field returns [Field ast ]: 
		type ID ';' {$ast = new Field($start.getLine(),$start.getCharPositionInLine()+1,$type.ast,$ID.getText());}
		;

idList returns [List<String> ast=new ArrayList<String>()]:
		id1=ID { $ast.add($id1.getText()); }
		(',' id2=ID { $ast.add($id2.getText()); } )*
		;

		
funcDef returns [FuncDefinition ast]: primitiveType ID '(' paramList ')' block
		{$ast = new FuncDefinition($start.getLine(),$start.getCharPositionInLine()+1,new FuncType($start.getLine(),$start.getCharPositionInLine()+1,$primitiveType.ast,$paramList.ast),$ID.text,$block.ast);}
		| 'void' ID '(' paramList ')' block
		{$ast = new FuncDefinition($start.getLine(),$start.getCharPositionInLine()+1,new FuncType($start.getLine(),$start.getCharPositionInLine()+1,VoidType.getInstance(),$paramList.ast),$ID.text,$block.ast);}
		| primitiveType ID '('')' block
		{$ast = new FuncDefinition($start.getLine(),$start.getCharPositionInLine()+1,new FuncType($start.getLine(),$start.getCharPositionInLine()+1,$primitiveType.ast,(List)new ArrayList<Statement>()),$ID.text,$block.ast);}
		| 'void' ID '('')' block
		{$ast = new FuncDefinition($start.getLine(),$start.getCharPositionInLine()+1,new FuncType($start.getLine(),$start.getCharPositionInLine()+1,VoidType.getInstance(),(List)new ArrayList<Statement>()),$ID.text,$block.ast);}
		;
		
paramList returns [List<VarDefinition> ast = new ArrayList<>();]: 
			p1=param {$ast.add($p1.ast);}
			(',' p2=param{$ast.add($p2.ast);})*
			;
			
param returns [VarDefinition ast]:
		primitiveType ID {$ast = new VarDefinition($start.getLine(),$start.getCharPositionInLine()+1,$primitiveType.ast,$ID.getText());}
		;
		
block returns [List<Statement> ast = new ArrayList<>();]:
		'{' (varDef{
			for(Statement st: $varDef.ast){
					$ast.add(st);
			}
			})* (stmnt{
			for(Statement st: $stmnt.ast){
					$ast.add(st);
			}
			})* 
		'}' 
		| (varDef{
			for(Statement st: $varDef.ast){
					$ast.add(st);
			}
			})* (stmnt{
			for(Statement st: $stmnt.ast){
					$ast.add(st);
			}
			})* 
		;
			
stmnt returns [List<Statement> ast = new ArrayList<>();]:
		  ioStmnt {$ast = $ioStmnt.ast;}
		| assignmentStmnt {$ast.add($assignmentStmnt.ast);}
		| returnStmnt {$ast.add($returnStmnt.ast);}
		| ifStmnt {$ast.add($ifStmnt.ast);}
		| whileStmnt {$ast.add($whileStmnt.ast);}
		| functInvocation ';' {$ast.add($functInvocation.ast);}
		;
		
ioStmnt returns [List<Statement> ast = new ArrayList<>()]: 
		  'write' expList ';' 
			{
				for(Expression exp: $expList.ast){
					$ast.add(new Write($start.getLine(),$start.getCharPositionInLine()+1,exp));
				}
			}
		| 'read' expList ';' 
			{
				for(Expression exp: $expList.ast){
					$ast.add(new Write($start.getLine(),$start.getCharPositionInLine()+1,exp));
				}
			}
	;
	
assignmentStmnt returns [Assignment ast]:
	exp1 = exp '=' exp2 = exp';' 
	{$ast = new Assignment($start.getLine(),$start.getCharPositionInLine()+1,$exp1.ast,$exp2.ast);}
	;
	
returnStmnt returns [ReturnStmnt ast]:
	'return' exp ';'
	{$ast = new ReturnStmnt($start.getLine(),$start.getCharPositionInLine()+1,$exp.ast);}
	;
	
ifStmnt returns [IfStmnt ast]:
		  'if' '(' exp ')' block 
		  {$ast = new IfStmnt($start.getLine(),$start.getCharPositionInLine()+1,$exp.ast,$block.ast,new ArrayList<Statement>());}
		| 'if' '(' exp ')' b1 = block 'else' b2 = block
		  {$ast = new IfStmnt($start.getLine(),$start.getCharPositionInLine()+1,$exp.ast,$b1.ast,$b2.ast);}
		;
	
whileStmnt returns [WhileStmnt ast]:
			'while' '('exp')' block
			{$ast = new WhileStmnt($start.getLine(),$start.getCharPositionInLine()+1,$exp.ast,$block.ast);}
			;
	
exp returns [Expression ast]:
	  exp1 = exp '['exp2 = exp']' {$ast = new IndexAccessExpr($start.getLine(),$start.getCharPositionInLine()+1,$exp1.text,$exp2.ast);}
	| '('exp')' {$ast = $exp.ast;}
	| exp1 = exp '.' exp2 = exp {$ast = new FieldAccessExpr($start.getLine(),$start.getCharPositionInLine()+1,$exp1.ast,$exp2.ast);}
	| cast exp { $ast = new Cast($start.getLine(),$start.getCharPositionInLine()+1,$cast.ast, $exp.ast);}
	| '-' exp {$ast = new UnaryMinus($start.getLine(),$start.getCharPositionInLine()+1,$exp.ast);}
	| '!' exp {$ast = new UnaryNegation($start.getLine(),$start.getCharPositionInLine()+1,$exp.ast);}
	| exp1 = exp op=('*' | '/' | '%') exp2 = exp {$ast = new Arithmetic($start.getLine(),$start.getCharPositionInLine()+1,$exp1.ast,$op.getText(),$exp2.ast);}
	| exp1 = exp op=('+' | '-' ) exp2 = exp {$ast = new Arithmetic($start.getLine(),$start.getCharPositionInLine()+1,$exp1.ast,$op.getText(),$exp2.ast);}
	| exp1 = exp op=('>' | '>=' | '<' | '<=' | '!=' | '==') exp2 = exp {$ast = new Comparison($start.getLine(),$start.getCharPositionInLine()+1,$exp1.ast,$op.getText(),$exp2.ast);}
	| exp1 = exp op=( '&&' | '||' ) exp2 = exp {$ast = new Logical($start.getLine(),$start.getCharPositionInLine()+1,$exp1.ast,$op.getText(),$exp2.ast);}
	| functInvocation {$ast = $functInvocation.ast;}
	| ID 			{ $ast = new Variable($start.getLine(),$start.getCharPositionInLine()+1,$ID.text); }
	| INT_CONSTANT  { $ast = new IntLiteral($start.getLine(),$start.getCharPositionInLine()+1,LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
	| REAL_CONSTANT { $ast = new RealLiteral($start.getLine(),$start.getCharPositionInLine()+1,LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
	| CHAR_CONSTANT { $ast = new CharLiteral($start.getLine(),$start.getCharPositionInLine()+1,LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
	;

cast returns [Type ast]: '('primitiveType')'
 	{$ast = $primitiveType.ast;}
	;

functInvocation returns [FunctionInvocation ast]:
				  ID '(' expList ')' {$ast = new FunctionInvocation($start.getLine(),$start.getCharPositionInLine()+1,new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.getText()),$expList.ast);}
				| ID '('')' {$ast = new FunctionInvocation($start.getLine(),$start.getCharPositionInLine()+1,new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.getText()),new ArrayList<Expression>());}
				;

expList returns [List<Expression> ast = new ArrayList<>()]:
		exp1 = exp {$ast.add($exp1.ast);}
		(',' exp2 = exp {$ast.add($exp2.ast);})*
		;

main returns [FuncDefinition ast]:
	void1='void' main1= 'main' '(' ')' block
	{
		$ast = new FuncDefinition($main1.getLine(),$main1.getCharPositionInLine()+1,new FuncType($start.getLine(),$start.getCharPositionInLine()+1,VoidType.getInstance(),(List)new ArrayList<Statement>()),$main1.text,$block.ast);
	}
	
	;
	       
/*************************** FRAGMENTS ***************************/
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
			
/*************************** LEXICAL RULES ***************************/



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


