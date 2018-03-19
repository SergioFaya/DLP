package ast.program.expressions;

import ast.program.Expression;
import visitor.Visitor;

public class Indexing extends AbstractExpression implements Expression{

	public Expression exprLeft;
	public Expression expBrackets;

	public Indexing(int line, int column,Expression exprLeft,Expression expBrackets) {
		super(line, column);
		this.exprLeft = exprLeft;
		this.expBrackets= expBrackets;
	}

	@Override
	public String toString() {
		return "Indexing [exprLeft=" + exprLeft + ", expBrackets=" + expBrackets + ", lValue=" + lValue + ", line="
				+ line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
