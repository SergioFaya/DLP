package ast.program.expressions;

import ast.program.Expression;
import visitor.Visitor;

public class Variable extends AbstractExpression implements Expression{
		
	public String name;
	
	public Variable(int line, int column, String name) {
		super(line,column);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Variable [name=" + name + ", line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
