package ast;

import java.util.ArrayList;
import java.util.List;

import statement.Statement;

public class Program extends AbstractASTNode{
	

	public List<Statement> statements = new ArrayList<>();
	
	public Program(int line, int column, List<Statement> statements) {
		this.line = line;
		this.column = column;
		this.statements = statements;
	}

	
}
