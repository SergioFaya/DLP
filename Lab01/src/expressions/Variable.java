package expressions;

import ast.AbstractASTNode;

public class Variable extends AbstractASTNode implements Expression{
	
	public String name;
	
	public Variable(int line, int column, String name) {
		this.line = line;
		this.column = column;
		this.name = name;
	}

	
}
