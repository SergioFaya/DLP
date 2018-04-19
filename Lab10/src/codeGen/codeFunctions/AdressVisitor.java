package codeGen.codeFunctions;

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

public class AdressVisitor extends AbstractCGVisitor<Void, Void>{

	@Override
	public Void visit(Assignment assign, Void param) {
		return null;
	}
	
	@Override
	public Void visit(Cast cast, Void param) {
		return null;
	}
	
	@Override
	public Void visit(CharLiteral charlit, Void param) {
		return null;
	}
	
	@Override
	public Void visit(IntLiteral intLit, Void param) {
		return null;
	}

	@Override
	public Void visit(RealLiteral realLit, Void param) {
		return null;
	}
	
	@Override
	public Void visit(Variable var, Void param) {
		return null;
	}
	
	@Override
	public Void visit(Arithmetic arith, Void param) {
		return null;
	}

	@Override
	public Void visit(Comparison comp, Void param) {
		return null;
	}
	
	@Override
	public Void visit(Logical logic, Void param) {
		return null;
	}
	
}