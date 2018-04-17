package ast.program.definitions;

import ast.program.Definition;
import ast.program.Type;
import ast.program.expressions.AbstractExpression;

public abstract class AbstractDefinition extends AbstractExpression implements Definition{

	public String name;
	private int offset;

	public AbstractDefinition(int line, int column,Type type, String name) {
		super(line, column);
		this.type = type;
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
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