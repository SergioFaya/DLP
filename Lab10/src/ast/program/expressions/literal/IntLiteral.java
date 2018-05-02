package ast.program.expressions.literal;

import ast.program.expressions.AbstractExpression;
import visitor.Visitor;

public class IntLiteral extends AbstractExpression {
	
	public int value;
	
	public IntLiteral(int line, int column, Integer value) {
		super(line,column);
		this.value = value;
	}

	@Override
	public String toString() {
		return "IntLiteral [value=" + value + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
	
	
}
