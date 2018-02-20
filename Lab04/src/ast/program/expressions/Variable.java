package ast.program.expressions;

import ast.AbstractASTNode;
import ast.program.Expression;

public class Variable extends AbstractASTNode implements Expression{
	
	public String name;
	
	public Variable(int line, int column, String name) {
		this.line = line;
		this.column = column;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Variable [name=" + name + "]";
	}

	
}
