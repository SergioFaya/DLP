package ast.program.definitions;

import ast.program.Type;

public class RecordDef extends AbstractDefinition{

	public RecordDef(int line, int column,Type type, String name) {
		super(line, column,type,name);
	}

	@Override
	public String toString() {
		return "RecordDef [type=" + type + ", name=" + name + ", line=" + line + ", column=" + column + "]";
	}
	
	
}
