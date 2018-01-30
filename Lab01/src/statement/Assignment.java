package statement;

import ast.AbstractASTNode;
import expressions.Expression;
import expressions.Variable;

public class Assignment extends AbstractASTNode implements Statement {

	public Expression exp;
	public Variable variable;

	public Assignment(int line, int column, Variable variable, Expression exp) {
		this.line = line;
		this.column = column;
		this.variable = variable;
		this.exp = exp;
	}

}
