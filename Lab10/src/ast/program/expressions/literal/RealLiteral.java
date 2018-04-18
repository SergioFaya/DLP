package ast.program.expressions.literal;

import ast.program.Expression;
import ast.program.expressions.AbstractExpression;
import visitor.Visitor;

public class RealLiteral extends AbstractExpression implements Expression{

	public Double value;

	public RealLiteral(int line, int column, Double value) {
		super(line, column);
		this.value = value;
	}

	@Override
	public String toString() {
		return "RealLiteral [value=" + value + ", line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
