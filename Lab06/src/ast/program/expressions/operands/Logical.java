package ast.program.expressions.operands;

import ast.program.Expression;
import ast.program.expressions.AbstractExpression;
import visitor.Visitor;

public class Logical extends AbstractExpression implements Expression {

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

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
