package ast.program.statements;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Statement;

public class ReturnStmnt extends AbstractASTNode implements Statement {

	public Expression exp;

	public ReturnStmnt(int line, int column, Expression exp) {
		super(line, column);
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "ReturnStmnt [exp=" + exp + ", line=" + line + ", column=" + column + "]";
	}
	

}
