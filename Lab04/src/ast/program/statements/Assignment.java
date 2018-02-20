package ast.program.statements;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Statement;
import ast.program.expressions.Variable;

public class Assignment extends AbstractASTNode implements Statement {

	public Expression exp;
	public Variable variable;

	public Assignment(int line, int column, Variable variable, Expression exp) {
		this.line = line;
		this.column = column;
		this.variable = variable;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Assignment [exp=" + exp + ", variable=" + variable + "]";
	}

	
}
