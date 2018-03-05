package ast.program.expressions.literal;

import ast.AbstractASTNode;
import ast.program.Expression;

public class IntLiteral extends AbstractASTNode implements Expression{
	
	public int value;
	
	public IntLiteral(int line, int column, int value) {
		super(line,column);
		this.value = value;
	}

	@Override
	public String toString() {
		return "IntLiteral [value=" + value + ", line=" + line + ", column=" + column + "]";
	}
	
	
}
