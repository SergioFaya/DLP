package ast.program.expressions.operands;

import ast.program.Expression;
import ast.program.expressions.AbstractExpression;
import visitor.Visitor;

public class Comparison extends AbstractExpression implements Expression {

	public Expression exprLeft;
	public Expression exprRight;
	public String operand;

	public Comparison(int line, int column, Expression exprLeft,String operand,Expression exprRight) {
		super(line, column);
		this.exprRight = exprRight;
		this.exprLeft = exprLeft;
		this.operand = operand;
	}

	@Override
	public String toString() {
		return "Comparison [exprLeft=" + exprLeft + ", exprRight=" + exprRight + ", operand=" + operand + ", lValue="
				+ lValue + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
