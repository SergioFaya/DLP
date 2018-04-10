package ast.program.expressions;

import ast.program.Expression;
import visitor.Visitor;

public class FieldAccessExpr extends AbstractExpression implements Expression {

	public Expression exprLeft;
	public String field;

	public FieldAccessExpr(int line, int column,Expression exprLeft,String field) {
		super(line, column);
		this.exprLeft = exprLeft;
		this.field = field;
	}

	@Override
	public String toString() {
		return "FieldAccessExpr [exprLeft=" + exprLeft + ", exprRight=" + field + ", line=" + line + ", column="
				+ column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

}
