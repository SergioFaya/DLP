package ast.program.expstmnt;

import java.util.List;

import ast.program.Expression;
import ast.program.Statement;
import ast.program.expressions.AbstractExpression;
import ast.program.expressions.Variable;
import visitor.Visitor;

public class FunctionInvocation extends AbstractExpression implements Statement, Expression {

	public Variable variable;
	public List<Expression> params;
	
	public FunctionInvocation(int line, int column, Variable variable,List<Expression> params) {
		super(line, column);
		this.variable = variable;
		this.params = params;
	}

	@Override
	public String toString() {
		return "FunctionInvocation [variable=" + variable + ", params=" + params + ", lValue=" + lValue + ", line="
				+ line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

}
