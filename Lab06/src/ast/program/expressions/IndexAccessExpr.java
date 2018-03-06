package ast.program.expressions;

import ast.program.Expression;
import visitor.Visitor;

public class IndexAccessExpr extends AbstractExpression implements Expression{

	public String name;
	public Expression exp;

	public IndexAccessExpr(int line, int column,String name,Expression exp) {
		super(line, column);
		this.name = name;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "IndexAccessExpr [name=" + name + ", exp=" + exp + ", line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
