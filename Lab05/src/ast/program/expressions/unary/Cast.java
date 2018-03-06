package ast.program.expressions.unary;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Type;

public class Cast extends AbstractASTNode implements Expression {

	public Type castType;
	public Expression exp;

	public Cast(int line, int column, Type castType, Expression exp) {
		super(line, column);
		this.castType = castType;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Cast [castType=" + castType + ", exp=" + exp + ", line=" + line + ", column=" + column + "]";
	}
	
	
	
}
