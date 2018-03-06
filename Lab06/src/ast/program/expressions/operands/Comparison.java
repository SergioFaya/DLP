package ast.program.expressions.operands;

import ast.program.Expression;
import ast.program.expressions.AbstractExpression;
import visitor.Visitor;

public class Comparison extends AbstractExpression implements Expression {

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

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
