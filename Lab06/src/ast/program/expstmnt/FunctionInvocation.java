package ast.program.expstmnt;

import java.util.List;

import ast.program.Expression;
import ast.program.Statement;
import ast.program.expressions.AbstractExpression;
import ast.program.expressions.Variable;
import visitor.Visitor;

public class FunctionInvocation extends AbstractExpression implements Statement {

	public Variable variable;
	public List<Expression> exps;
	
	public FunctionInvocation(int line, int column, Variable variable,List<Expression> exps) {
		super(line, column);
		this.variable = variable;
		this.exps = exps;
	}

	@Override
	public String toString() {
		return "FunctionInvocation [variable=" + variable + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

}
