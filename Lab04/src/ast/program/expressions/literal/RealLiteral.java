package ast.program.expressions.literal;

import ast.AbstractASTNode;
import ast.program.Expression;

public class RealLiteral extends AbstractASTNode implements Expression{

	public Double value;

	public RealLiteral(int line, int column, Double value) {
		super(line, column);
		this.value = value;
	}

	@Override
	public String toString() {
		return "RealLiteral [value=" + value + ", line=" + line + ", column=" + column + "]";
	}
	
}
