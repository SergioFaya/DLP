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

public class AddressVisitor extends AbstractCGVisitor<FuncDefinition, Void>{

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
		return null;
	}
	
	@Override
	public Void visit(Arithmetic arith, FuncDefinition param) {
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
		indexing.exprLeft.accept(cfs.getAddress(), param);
		indexing.expBrackets.accept(cfs.getAddress(), param);
		cg.push(indexing.getType().getSuffix(),indexing.getType().getNumberOfBytes());
		cg.mul(indexing.getType().getSuffix());
		cg.add(indexing.getType().getSuffix());
		return null;
	}
	
	@Override
	public Void visit(FieldAccessExpr fieldExpr, FuncDefinition param) {
		fieldExpr.exprLeft.accept(cfs.getAddress(), param);
		return null;
	}
}