package program.expressions;

import ast.AbstractASTNode;
import program.Expression;

public class Arithmetic extends AbstractASTNode implements Expression {
	
	
	public String operand;
	public Expression expressionLeft;
	public Expression expressionRight;
	
	public Arithmetic(int line, int column, Expression expressionLeft, String operand, Expression expressionRight) {
		this.line = line;
		this.column = column;
		this.expressionRight = expressionRight;
		this.expressionLeft = expressionLeft;
		this.operand = operand;
	}

	@Override
	public String toString() {
		return "Arithmetic [expressionLeft=" + expressionLeft + ",operand=" + operand + ", expressionRight="
				+ expressionRight + "]";
	}
	
	
}
