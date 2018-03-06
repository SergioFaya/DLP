package ast.program.expressions;

import ast.AbstractASTNode;
import ast.program.Expression;

public class FieldAccessExpr extends AbstractASTNode implements Expression {

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
	
	

}
