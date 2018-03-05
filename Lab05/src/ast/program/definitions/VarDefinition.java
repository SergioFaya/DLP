package ast.program.definitions;

import ast.program.Statement;
import ast.program.Type;

public class VarDefinition extends AbstractDefinition implements Statement{

	public VarDefinition(int line, int column,Type type,String name) {
		super(line, column, type, name);
	}

	@Override
	public String toString() {
		return "VarDefinition [type=" + type + ", name=" + name + ", line=" + line + ", column=" + column + "]";
	}
	
}
