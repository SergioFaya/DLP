package ast.program.expressions.operands;

import ast.program.Expression;
import ast.program.expressions.AbstractExpression;
import visitor.Visitor;

public class Logical extends AbstractExpression implements Expression {

	public String operand;
	public Expression exprLeft;
	public Expression exprRight;

	public Logical(int line, int column,Expression exprLeft,String operand,Expression exprRight) {
		super(line, column);
		this.exprRight = exprRight;
		this.exprLeft = exprLeft;
		this.operand = operand;
	}

	@Override
	public String toString() {
		return "Logical [operand=" + operand + ", exprLeft=" + exprLeft + ", exprRight=" + exprRight + ", lValue="
				+ lValue + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
