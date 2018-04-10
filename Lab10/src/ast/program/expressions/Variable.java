package ast.program.expressions;

import ast.program.Definition;
import ast.program.Expression;
import ast.program.Type;
import visitor.Visitor;

public class Variable extends AbstractExpression implements Expression{
		
	public String name;
	private Definition definition;
	
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

	public Definition getDefinition() {
		return definition;
	}

	public void setDefinition(Definition definition) {
		this.definition = definition;
	}

	@Override
	public Type getType() {
		return definition.getType();
	}
	
	@Override
	public Type setType(Type type) {
		return this.type = type;
	}
	
}
