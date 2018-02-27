package ast.program.statements;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Statement;

public class Assignment extends AbstractASTNode implements Statement {

	public Expression expRight;
	public Expression expLeft;

	public Assignment(int line, int column, Expression expLeft, Expression expRight) {
		super(line,column);
		this.expRight = expRight;
		this.expLeft = expLeft;
	}

	@Override
	public String toString() {
		return "Assignment [expRight=" + expRight + ", expLeft=" + expLeft + ", line=" + line + ", column=" + column
				+ "]";
	}

	
}
