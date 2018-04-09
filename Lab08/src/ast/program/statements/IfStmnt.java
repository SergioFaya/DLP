package ast.program.statements;

import java.util.List;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Statement;
import visitor.Visitor;

public class IfStmnt extends AbstractASTNode implements Statement {

	public List<Statement> elseStmnts;
	public List<Statement> ifStmnts;
	public Expression exp;
	
	public IfStmnt(int line, int column,Expression exp,List<Statement> ifStmnts, List<Statement> elseStmnts) {
		super(line, column);
		this.exp = exp;
		this.ifStmnts = ifStmnts;
		this.elseStmnts = elseStmnts;
	}

	@Override
	public String toString() {
		return "IfStmnt [elseStmnts=" + elseStmnts + ", ifStmnts=" + ifStmnts + ", exp=" + exp + ", line=" + line
				+ ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
