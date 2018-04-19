package visitor;

import ast.Program;
import ast.program.definitions.Field;
import ast.program.definitions.FuncDefinition;
import ast.program.definitions.VarDefinition;
import ast.program.expressions.FieldAccessExpr;
import ast.program.expressions.Indexing;
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
import ast.program.types.RecordType;
import ast.program.types.primitive.CharType;
import ast.program.types.primitive.IntType;
import ast.program.types.primitive.RealType;
import ast.program.types.primitive.VoidType;
import codeGen.CodeGenerator;

public abstract class AbstractCGVisitor<TP,TR> implements Visitor<TP, TR>{
	
	protected CodeGenerator cg;
	
	public AbstractCGVisitor() {
		this.cg = new CodeGenerator();
	}
	
	@Override
	public TR visit(Field field, TP param) {
		throw new RuntimeException("Code function for Field is not defined");
	}

	@Override
	public TR visit(FuncDefinition funcDef, TP param) {
		throw new RuntimeException("Code function for FuncDefinition is not defined");
	}

	@Override
	public TR visit(VarDefinition varDef, TP param) {
		throw new RuntimeException("Code function for VarDefinition is not defined");
	}

	@Override
	public TR visit(FieldAccessExpr fieldExpr, TP param) {
		throw new RuntimeException("Code function for FieldAccessExpr is not defined");
	}

	@Override
	public TR visit(Indexing indexing, TP param) {
		throw new RuntimeException("Code function for indexing is not defined");
	}

	@Override
	public TR visit(Variable var, TP param) {
		throw new RuntimeException("Code function for Variable is not defined");		
	}

	@Override
	public TR visit(Arithmetic arith, TP param) {
		throw new RuntimeException("Code function for Arithmetic is not defined");
	}

	@Override
	public TR visit(Logical logic, TP param) {
		throw new RuntimeException("Code function for Logical is not defined");
	}

	@Override
	public TR visit(Comparison comp, TP param) {
		throw new RuntimeException("Code function for Comparison is not defined");
	}

	@Override
	public TR visit(IntLiteral intLit, TP param) {
		throw new RuntimeException("Code function for IntLiteral is not defined");
	}

	@Override
	public TR visit(RealLiteral realLit, TP param) {
		throw new RuntimeException("Code function for RealLiteral is not defined");
	}

	@Override
	public TR visit(CharLiteral charlit, TP param) {
		throw new RuntimeException("Code function for CharLiteral is not defined");		
	}

	@Override
	public TR visit(Cast cast, TP param) {
		throw new RuntimeException("Code function for Cast is not defined");
	}

	@Override
	public TR visit(UnaryMinus uminus, TP param) {
		throw new RuntimeException("Code function for UnaryMinus is not defined");
	}

	@Override
	public TR visit(UnaryNegation unegation, TP param) {
		throw new RuntimeException("Code function for UnaryNegation is not defined");
	}

	@Override
	public TR visit(FunctionInvocation functType, TP param) {
		throw new RuntimeException("Code function for FuncType is not defined");
	}

	@Override
	public TR visit(Assignment assign, TP param) {
		throw new RuntimeException("Code function for Assignment is not defined");
	}

	@Override
	public TR visit(IfStmnt ifStmnt, TP param) {
		throw new RuntimeException("Code function for IfStatement is not defined");
	}

	@Override
	public TR visit(Read readStmnt, TP param) {
		throw new RuntimeException("Code function for ReadStmnt is not defined");
	}

	@Override
	public TR visit(ReturnStmnt retStmnt, TP param) {
		throw new RuntimeException("Code function for ReturnStmnt is not defined");
	}

	@Override
	public TR visit(WhileStmnt whileStmnt, TP param) {
		throw new RuntimeException("Code function for WhileStmnt is not defined");
	}

	@Override
	public TR visit(Write writeStmnt, TP param) {
		throw new RuntimeException("Code function for WriteStmnt is not defined");
	}

	@Override
	public TR visit(ArrayType arrayType, TP param) {
		throw new RuntimeException("Code function for ArrayType is not defined");
	}

	@Override
	public TR visit(ErrorType errType, TP param) {
		throw new RuntimeException("Code function for ErrorType is not defined");
	}

	@Override
	public TR visit(FuncType funcType, TP param) {
		throw new RuntimeException("Code function for Functype is not defined");
	}

	@Override
	public TR visit(RecordType structType, TP param) {
		throw new RuntimeException("Code function for StructType is not defined");
	}

	@Override
	public TR visit(CharType charType, TP param) {
		throw new RuntimeException("Code function for CharType is not defined");
	}

	@Override
	public TR visit(IntType intType, TP param) {
		throw new RuntimeException("Code function for IntType is not defined");
	}

	@Override
	public TR visit(RealType real, TP param) {
		throw new RuntimeException("Code function for RealType is not defined");
	}

	@Override
	public TR visit(VoidType voidType, TP param) {
		throw new RuntimeException("Code function for VoidType is not defined");
	}

	@Override
	public TR visit(Program program, TP param) {
		throw new RuntimeException("Code function for Program is not defined");
	}

	
}
