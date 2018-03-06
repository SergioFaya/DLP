package visitor;

import ast.Program;
import ast.program.definitions.Field;
import ast.program.definitions.FuncDefinition;
import ast.program.definitions.VarDefinition;
import ast.program.expressions.FieldAccessExpr;
import ast.program.expressions.IndexAccessExpr;
import ast.program.expressions.Variable;
import ast.program.expressions.literal.CharLiteral;
import ast.program.expressions.literal.IntLiteral;
import ast.program.expressions.literal.RealLiteral;
import ast.program.expressions.operands.Arithmetic;
import ast.program.expressions.operands.Comparison;
import ast.program.expressions.operands.Logical;
import ast.program.expressions.unary.Cast;
import ast.program.expressions.unary.UnaryMinus;
import ast.program.expressions.unary.UnaryNegation;
import ast.program.expstmnt.FunctionInvocation;
import ast.program.statements.Assignment;
import ast.program.statements.IfStmnt;
import ast.program.statements.Read;
import ast.program.statements.ReturnStmnt;
import ast.program.statements.WhileStmnt;
import ast.program.statements.Write;
import ast.program.types.ArrayType;
import ast.program.types.ErrorType;
import ast.program.types.FuncType;
import ast.program.types.StructType;
import ast.program.types.primitive.CharType;
import ast.program.types.primitive.IntType;
import ast.program.types.primitive.RealType;
import ast.program.types.primitive.VoidType;

public interface Visitor<TP,TR> {

	//Definitions
	TR visit(Field field, TP param);
	
	TR visit(FuncDefinition funcDef, TP param);
	
	TR visit(VarDefinition varDef, TP param);
	
	
	//Expressions
	TR visit(FieldAccessExpr fieldExpr, TP param);
	
	TR visit(IndexAccessExpr indexing, TP param);
	
	TR visit(Variable var, TP param);
		//operands
	TR visit(Arithmetic arith, TP param);
	
	TR visit(Logical logic, TP param);
	
	TR visit(Comparison comp, TP param);
	
		//literals
	TR visit(IntLiteral intLit, TP param);
	
	TR visit(RealLiteral realLit, TP param);
	
	TR visit(CharLiteral charlit, TP param);
		//unary
	TR visit(Cast cast, TP param);
	
	TR visit(UnaryMinus uminus, TP param);
	
	TR visit(UnaryNegation unegation, TP param);

	//Expression and Statement
	TR visit(FunctionInvocation functType,TP param);
	
	//Statements
	TR visit(Assignment assign, TP param);
	
	TR visit(IfStmnt ifStmnt, TP param);
	
	TR visit(Read readStmnt, TP param);
	
	TR visit(ReturnStmnt retStmnt, TP param);
	
	TR visit(WhileStmnt whileStmnt, TP param);
	
	TR visit(Write writeStmnt, TP param);
	
	//Types
	TR visit(ArrayType arrayType, TP param);
	
	TR visit(ErrorType errType, TP param);
	
	TR visit(FuncType funcType, TP param);
	
	TR visit(StructType structType, TP param);
		//primitive type
	TR visit(CharType charType, TP param);
	
	TR visit(IntType intType, TP param);
	
	TR visit(RealType real, TP param);
	
	TR visit(VoidType voidType, TP param);

	//PROGRAM
	TR visit(Program program, TP p);

}
