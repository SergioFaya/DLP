package codeGen.codeFunctions;

import ast.program.definitions.FuncDefinition;
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
import ast.program.statements.Assignment;
import visitor.AbstractCGVisitor;

public class ValueVisitor extends AbstractCGVisitor<FuncDefinition, Void>{

	private CodeFunctions cfs = CodeFunctions.getInstance();
	
	@Override
	public Void visit(Assignment assign, FuncDefinition param) {
		return null;
	}
	
	@Override
	public Void visit(Cast cast, FuncDefinition param) {
		return null;
	}
	
	@Override
	public Void visit(CharLiteral charlit, FuncDefinition param) {
		return null;
	}
	
	@Override
	public Void visit(IntLiteral intLit, FuncDefinition param) {
		return null;
	}

	@Override
	public Void visit(RealLiteral realLit, FuncDefinition param) {
		return null;
	}
	
	@Override
	public Void visit(Variable var, FuncDefinition param) {
		var.accept(cfs.getAddress(), param);
		cg.load(var.getDefinition().getType().getSuffix());
		return null;
	}
	
	@Override
	public Void visit(Arithmetic arith, FuncDefinition param) {
		arith.exprLeft.accept(cfs.getValue(), param);
		arith.exprLeft.
		return null;
	}

	@Override
	public Void visit(Comparison comp, FuncDefinition param) {
		return null;
	}
	
	@Override
	public Void visit(Logical logic, FuncDefinition param) {
		return null;
	}
	
	@Override
	public Void visit(Indexing indexing, FuncDefinition param) {
		indexing.accept(cfs.getAddress(), param);
		cg.load(indexing.getType().getSuffix());
		return null;
	}
	
	@Override
	public Void visit(FieldAccessExpr fieldExpr, FuncDefinition param) {
		fieldExpr.accept(cfs.getAddress(), param);
		cg.load(fieldExpr.getType().getSuffix());
		return null;
	}
	
}