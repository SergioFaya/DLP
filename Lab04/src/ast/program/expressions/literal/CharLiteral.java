package ast.program.expressions.literal;

import ast.AbstractASTNode;
import ast.program.Expression;

public class CharLiteral extends AbstractASTNode implements Expression {

	public char value;
	
	public CharLiteral(int line, int column,char value) {
		super(line, column);
		this.value = value;
	}

	@Override
	public String toString() {
		return "CharLiteral [value=" + value + ", line=" + line + ", column=" + column + "]";
	}

}
