package ast.program.statements;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Statement;
import visitor.Visitor;

public class Assignment extends AbstractASTNode implements Statement {

	private Expression expRight;
	private Expression expLeft;
	private boolean lValue;

	public Assignment(int line, int column, Expression expLeft, Expression expRight) {
		super(line,column);
		this.expRight = expRight;
		this.expLeft = expLeft;
	}

	@Override
	public String toString() {
		return "Assignment [expRight=" + expRight + ", expLeft=" + expLeft + ", lValue=" + lValue + ", line=" + line
				+ ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

	public Expression getExpRight() {
		return expRight;
	}

	public void setExpRight(Expression expRight) {
		this.expRight = expRight;
	}

	public Expression getExpLeft() {
		return expLeft;
	}

	public void setExpLeft(Expression expLeft) {
		this.expLeft = expLeft;
	}
	
	
}
