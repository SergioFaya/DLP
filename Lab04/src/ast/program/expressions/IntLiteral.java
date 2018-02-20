package ast.program.expressions;

import ast.AbstractASTNode;
import ast.program.Expression;

public class IntLiteral extends AbstractASTNode implements Expression{
	
	public IntLiteral(int i, int j, int value) {
		this.value = value;
	}

	public int value;

	@Override
	public String toString() {
		return "IntLiteral [value=" + value + "]";
	}

	
	
}
