package ast.program.expressions.unary;

import ast.AbstractASTNode;
import ast.program.Expression;

public class UnaryNegation extends AbstractASTNode implements Expression {

	public Expression exp;
	
	public UnaryNegation(int line, int column, Expression exp) {
		super(line, column);
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "UnaryNegation [exp=" + exp + ", line=" + line + ", column=" + column + "]";
	}

	
}
