package ast.program.expressions;

import ast.AbstractASTNode;
import ast.program.Expression;

public class FieldAccessExpr extends AbstractASTNode implements Expression {

	public String name;
	public Expression exp;

	public FieldAccessExpr(int line, int column,String name,Expression exp) {
		super(line, column);
		this.name = name;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "FieldAccessExpr [name=" + name + ", exp=" + exp + ", line=" + line + ", column=" + column + "]";
	}
	
	

}
