package expressions;

import ast.AbstractASTNode;

public class IntLiteral extends AbstractASTNode implements Expression{
	
	public IntLiteral(int i, int j, int value) {
		this.value = value;
	}

	public int value;

}
