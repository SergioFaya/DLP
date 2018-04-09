package ast.program.expressions.unary;

import ast.program.Expression;
import ast.program.expressions.AbstractExpression;
import visitor.Visitor;

public class UnaryNegation extends AbstractExpression implements Expression {

	public Expression exp;
	
	public UnaryNegation(int line, int column, Expression exp) {
		super(line, column);
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "UnaryNegation [exp=" + exp + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
