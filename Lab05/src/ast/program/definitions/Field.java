package ast.program.definitions;

import ast.program.Type;

public class Field extends AbstractDefinition{

	public Field(int line, int column,Type type, String name) {
		super(line, column,type,name);
	}

	@Override
	public String toString() {
		return "Field [type=" + type + ", name=" + name + ", line=" + line + ", column=" + column + "]";
	}
	
	
}
