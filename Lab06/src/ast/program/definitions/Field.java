package ast.program.definitions;

import ast.program.Type;
import visitor.Visitor;

public class Field extends AbstractDefinition{

	public Field(int line, int column,Type type, String name) {
		super(line, column,type,name);
	}

	@Override
	public String toString() {
		return "Field [type=" + type + ", name=" + name + ", line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
