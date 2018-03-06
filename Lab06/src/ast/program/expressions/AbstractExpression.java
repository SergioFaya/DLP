package ast.program.expressions;

import ast.AbstractASTNode;
import ast.program.Expression;

public abstract class AbstractExpression  extends AbstractASTNode implements Expression{

	public AbstractExpression(int line, int column) {
		super(line, column);
	}

	protected boolean lValue;
	
	@Override
	public boolean getLvalue() {
		return lValue;
	}
	
	@Override
	public void setLvalue(boolean lValue) {
		this.lValue = lValue;
	}
}
