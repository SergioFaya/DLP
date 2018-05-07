package ast.program.expressions;

import ast.program.Type;
import ast.program.definitions.VarDefinition;
import visitor.Visitor;

public class Variable extends AbstractExpression {

	public String name;
	private VarDefinition definition;

	public Variable(int line, int column, String name) {
		super(line, column);
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

	public VarDefinition getDefinition() {
		return definition;
	}

	public void setDefinition(VarDefinition definition) {
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
