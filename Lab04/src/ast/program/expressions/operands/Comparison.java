package ast.program.expressions.operands;

import ast.AbstractASTNode;
import ast.program.Expression;

public class Comparison extends AbstractASTNode implements Expression {

	public Expression expressionLeft;
	public Expression expressionRight;
	public String operand;

	public Comparison(int line, int column, Expression expressionLeft,String operand,Expression expressionRight) {
		super(line, column);
		this.expressionRight = expressionRight;
		this.expressionLeft = expressionLeft;
		this.operand = operand;
	}

	@Override
	public String toString() {
		return "Comparison [expressionLeft=" + expressionLeft + ", expressionRight=" + expressionRight + ", operand="
				+ operand + ", line=" + line + ", column=" + column + "]";
	}

	
}
