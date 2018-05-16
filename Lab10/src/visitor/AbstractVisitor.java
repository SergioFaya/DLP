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

public abstract class AbstractVisitor<TP,TR> implements Visitor<TP, TR>{

	@Override
	public TR visit(Field field, TP param) {
		field.getType().accept(this, param);
		return null;
	}

	@Override
	public TR visit(FuncDefinition funcDef, TP param) {
		funcDef.getType().accept(this, param);
		funcDef.body.forEach(st -> st.accept(this, param));
		return null;
	}

	@Override
	public TR visit(VarDefinition varDef, TP param) {
		varDef.getType().accept(this, param);
		return null;
	}

	@Override
	public TR visit(FieldAccessExpr fieldExpr, TP param) {
		fieldExpr.exprLeft.accept(this, param);
		return null;
	}

	@Override
	public TR visit(Indexing indexing, TP param) {
		indexing.exprLeft.accept(this, param);
		indexing.expBrackets.accept(this, param);
		return null;
	}

	@Override
	public TR visit(Variable var, TP param) {
		return null;
	}

	@Override
	public TR visit(Arithmetic arith, TP param) {
		arith.exprLeft.accept(this, param);
		arith.exprRight.accept(this, param);
		return null;
	}

	@Override
	public TR visit(Logical logic, TP param) {
		logic.exprLeft.accept(this, param);
		logic.exprRight.accept(this, param);
		return null;
	}

	@Override
	public TR visit(Comparison comp, TP param) {
		comp.exprLeft.accept(this, param);
		comp.exprRight.accept(this, param);
		return null;
	}

	@Override
	public TR visit(IntLiteral intLit, TP param) {
		return null;
	}

	@Override
	public TR visit(RealLiteral realLit, TP param) {
		return null;
	}

	@Override
	public TR visit(CharLiteral charlit, TP param) {
		return null;
	}

	@Override
	public TR visit(Cast cast, TP param) {
		cast.exp.accept(this, param);
		cast.getDynamicType().accept(this, param);
		return null;
	}

	@Override
	public TR visit(UnaryMinus uminus, TP param) {
		uminus.expression.accept(this, param);
		return null;
	}

	@Override
	public TR visit(UnaryNegation unegation, TP param) {
		unegation.exp.accept(this, param);
		return null;
	}

	@Override
	public TR visit(FunctionInvocation functType, TP param) {
		functType.variable.accept(this, param);
		functType.params.forEach(p -> p.accept(this, param));
		return null;
	}
	
	@Override
	public TR visit(Assignment assign, TP param) {
		assign.getExpLeft().accept(this, param);
		assign.getExpRight().accept(this, param);
		return null;
	}

	@Override
	public TR visit(IfStmnt ifStmnt, TP param) {
		ifStmnt.exp.accept(this, param);
		ifStmnt.elseStmnts.forEach(st-> st.accept(this, param));
		ifStmnt.ifStmnts.forEach(st-> st.accept(this, param));
		return null;
	}

	@Override
	public TR visit(Read readStmnt, TP param) {
		readStmnt.exp.accept(this, param);
		return null;
	}

	@Override
	public TR visit(ReturnStmnt retStmnt, TP param) {
		retStmnt.exp.accept(this, param);
		return null;
	}

	@Override
	public TR visit(WhileStmnt whileStmnt, TP param) {
		whileStmnt.exp.accept(this,param);
		whileStmnt.stmnts.forEach(st -> st.accept(this, param));
		return null;
	}

	@Override
	public TR visit(Write writeStmnt, TP param) {
		writeStmnt.expression.accept(this, param);
		return null;
	}

	@Override
	public TR visit(ArrayType arrayType, TP param) {
		arrayType.type.accept(this, param);
		return null;
	}

	@Override
	public TR visit(ErrorType errType, TP param) {
		return null;
	}

	@Override
	public TR visit(FuncType funcType, TP param) {
		funcType.returnType.accept(this, param);
		funcType.params.forEach(p-> p.accept(this, param));
		return null;
	}

	@Override
	public TR visit(RecordType structType, TP param) {
		structType.fields.forEach(p -> p.accept(this, param));
		return null;
	}

	@Override
	public TR visit(CharType charType, TP param) {
		return null;
	}

	@Override
	public TR visit(IntType intType, TP param) {
		return null;
	}

	@Override
	public TR visit(RealType real, TP param) {
		return null;
	}

	@Override
	public TR visit(VoidType voidType, TP param) {
		return null;
	}

	@Override
	public TR visit(Program program, TP param) {
		program.definitions.forEach(def->def.accept(this, param));
		return null;
	}

}