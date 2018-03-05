package ast.program.expressions.unary;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Type;

public class Cast extends AbstractASTNode implements Expression {

	public Type type;
	public Expression exp;

	public Cast(int line, int column, Type type, Expression exp) {
		super(line, column);
		this.type = type;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Cast [type=" + type + ", exp=" + exp + ", line=" + line + ", column=" + column + "]";
	}
	
	
	
}
