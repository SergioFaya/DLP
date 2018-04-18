package ast.program.statements;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Statement;
import visitor.Visitor;

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
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
