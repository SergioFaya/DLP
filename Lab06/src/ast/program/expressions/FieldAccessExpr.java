package ast.program.expressions;

import ast.program.Expression;
import visitor.Visitor;

public class FieldAccessExpr extends AbstractExpression implements Expression {

	public Expression exprLeft;
	public Expression exprRight;

	public FieldAccessExpr(int line, int column,Expression exprLeft,Expression exprRight) {
		super(line, column);
		this.exprLeft = exprLeft;
		this.exprRight = exprRight;
	}

	@Override
	public String toString() {
		return "FieldAccessExpr [exprLeft=" + exprLeft + ", exprRight=" + exprRight + ", line=" + line + ", column="
				+ column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

}
