package ast.program.expressions.unary;

import ast.program.Expression;
import ast.program.Type;
import ast.program.expressions.AbstractExpression;
import visitor.Visitor;

public class Cast extends AbstractExpression implements Expression {

	public Expression exp;

	public Cast(int line, int column, Type castType, Expression exp) {
		super(line, column);
		this.exp = exp;
		super.type = castType;
	}

	@Override
	public String toString() {
		return "Cast [exp=" + exp + ", lValue=" + lValue + ", type=" + type + ", line=" + line + ", column=" + column
				+ "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
	
}
