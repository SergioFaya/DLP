package program;

import java.util.ArrayList;
import java.util.List;

import ast.AbstractASTNode;

public class Program extends AbstractASTNode{
	

	public List<Statement> statements = new ArrayList<>();
	
	public Program(int line, int column, List<Statement> statements) {
		this.line = line;
		this.column = column;
		this.statements = statements;
	}

	@Override
	public String toString() {
		return "Program [line=" + line + ", column=" + column + "]";
	}
	
	

	
}
