package ast.program.expressions.operands;

import ast.AbstractASTNode;
import ast.program.Expression;

public class Logical extends AbstractASTNode implements Expression {

	public String operand;
	public Expression expressionLeft;
	public Expression expressionRight;

	public Logical(int line, int column,Expression expressionLeft,String operand,Expression expressionRight) {
		super(line, column);
		this.expressionRight = expressionRight;
		this.expressionLeft = expressionLeft;
		this.operand = operand;
	}

	@Override
	public String toString() {
		return "Logical [operand=" + operand + ", expressionLeft=" + expressionLeft + ", expressionRight="
				+ expressionRight + ", line=" + line + ", column=" + column + "]";
	}

}
