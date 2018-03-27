package ast.program.expressions;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Type;

public abstract class AbstractExpression  extends AbstractASTNode implements Expression{

	public AbstractExpression(int line, int column) {
		super(line, column);
	}

	protected boolean lValue;
	protected Type type;
	
	@Override
	public boolean getLvalue() {
		return lValue;
	}
	
	@Override
	public void setLvalue(boolean lValue) {
		this.lValue = lValue;
	}
	
	@Override
	public Type getType() {
		return type;
	}
	
	@Override
	public Type setType(Type type) {
		return this.type = type;
	}
}
