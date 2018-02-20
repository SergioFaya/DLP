package ast.program.expressions;

import ast.AbstractASTNode;
import ast.program.Expression;

public class UnaryMinus extends AbstractASTNode implements Expression{

	public Expression expression;
	
	public UnaryMinus(int line, int column, Expression expression) {
		this.line = line;
		this.column = column;
		this.expression = expression;
	}

	@Override
	public String toString() {
		return "UnaryMinus [expression=" + expression + "]";
	}
	
	
}
