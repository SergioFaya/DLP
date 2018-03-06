package ast.program.definitions;

import ast.program.Statement;
import ast.program.Type;
import visitor.Visitor;

public class VarDefinition extends AbstractDefinition implements Statement{

	public VarDefinition(int line, int column,Type type,String name) {
		super(line, column, type, name);
	}

	@Override
	public String toString() {
		return "VarDefinition [type=" + type + ", name=" + name + ", line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
