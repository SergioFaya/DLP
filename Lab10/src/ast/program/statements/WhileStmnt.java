package ast.program.statements;

import java.util.List;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Statement;
import visitor.Visitor;

public class WhileStmnt extends AbstractASTNode implements Statement {

	public Expression exp;
	public List<Statement> stmnts;
	
	public WhileStmnt(int line, int column, Expression exp,List<Statement> stmnts) {
		super(line, column);
		this.stmnts = stmnts;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "WhileStmnt [exp=" + exp + ", line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
	
	

}
