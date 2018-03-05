package ast.program.statements;

import java.util.List;

import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Statement;

public class IfStmnt extends AbstractASTNode implements Statement {

	public List<Statement> elseExp;
	public List<Statement> ifExp;
	public Expression exp;
	
	public IfStmnt(int line, int column,Expression exp,List<Statement> ifExp, List<Statement> elseExp) {
		super(line, column);
		this.exp = exp;
		this.ifExp = ifExp;
		this.elseExp = elseExp;
	}

	@Override
	public String toString() {
		return "IfStmnt [elseExp=" + elseExp + ", ifExp=" + ifExp + ", exp=" + exp + ", line=" + line + ", column="
				+ column + "]";
	}
	
}
