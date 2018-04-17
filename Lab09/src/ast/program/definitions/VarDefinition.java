package ast.program.definitions;

import ast.program.Statement;
import ast.program.Type;
import visitor.Visitor;

public class VarDefinition extends AbstractDefinition implements Statement{

	private int scope;
	private int offset;

	public VarDefinition(int line, int column,Type type,String name) {
		super(line, column, type, name);
	}

	//For the test
	public VarDefinition(int line, int column, String name, Type type) {
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
	
	@Override
	public int getScope() {
		return scope;
	}

	@Override
	public void setScope(int scope) {
		this.scope = scope;		
	}

	@Override
	public int getOffset() {
		return this.offset;
	}

	@Override
	public void setOffset(int offset) {
		this.offset = offset;
	}
}
