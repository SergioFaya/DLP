package ast.program.expressions.unary;

import ast.program.Statement;
import ast.program.expressions.AbstractExpression;
import ast.program.expressions.Variable;
import visitor.Visitor;

/**
 * CAlled increment and decrement as the lexical recognition has only been implemented for ++ and -- but it is also valid for any other input
 * @author Sergio
 *
 */
public class UnaryIncrementDecrement extends AbstractExpression implements Statement{
	public boolean isExpFirst;
	public String operator;
	public Variable variable;
	
	public UnaryIncrementDecrement(int line, int column,Variable variable,String operator, boolean isExpFirst) {
		super(line, column);
		this.isExpFirst = isExpFirst;
		this.operator = operator;
		this.variable = variable;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
	
	@Override
	public String toString() {
		return "UnaryIncrementDecrement [isExpFirst=" + isExpFirst + ", operator=" + operator + ", variable=" + variable
				+ ", lValue=" + lValue + ", type=" + type + ", line=" + line + ", column=" + column + "]";
	}
}
