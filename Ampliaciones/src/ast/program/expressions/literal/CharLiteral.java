package ast.program.expressions.literal;

import ast.program.expressions.AbstractExpression;
import visitor.Visitor;

public class CharLiteral extends AbstractExpression {

	public char value;
	
	public CharLiteral(int line, int column,char value) {
		super(line, column);
		this.value = value;
	}

	@Override
	public String toString() {
		return "CharLiteral [value=" + value + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
	

}
