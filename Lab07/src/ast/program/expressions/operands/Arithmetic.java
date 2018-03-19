package ast.program.expressions.operands;

import ast.program.Expression;
import ast.program.expressions.AbstractExpression;
import visitor.Visitor;

public class Arithmetic extends AbstractExpression implements Expression {
	
	
	public String operand;
	public Expression exprLeft;
	public Expression exprRight;
	
	public Arithmetic(int line, int column, Expression exprLeft, String operand, Expression exprRight) {
		super(line,column);
		this.exprLeft = exprLeft;
		this.exprRight = exprRight;
		this.operand = operand;
	}

	@Override
	public String toString() {
		return "Arithmetic [operand=" + operand + ", exprLeft=" + exprLeft + ", exprRight=" + exprRight + ", lValue="
				+ lValue + ", line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
	
}
