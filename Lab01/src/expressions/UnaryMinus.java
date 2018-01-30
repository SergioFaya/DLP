package expressions;

import ast.AbstractASTNode;

public class UnaryMinus extends AbstractASTNode implements Expression{

	public Expression expression;
	
	public UnaryMinus(int line, int column, Expression expression) {
		this.line = line;
		this.column = column;
		this.expression = expression;
	}
}
