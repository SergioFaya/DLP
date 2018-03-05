package ast.program.expstmnt;

import java.util.List;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Statement;
import ast.program.expressions.Variable;

public class FunctionInvocation extends AbstractASTNode implements Statement ,Expression {

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
	

}
