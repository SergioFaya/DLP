package ast.program;

import java.util.List;

import ast.AbstractASTNode;

public class Program extends AbstractASTNode{
	

	public List<Definition> definitions = null;
	
	public Program(int line, int column, List<Definition> definitions) {
		this.line = line;
		this.column = column;
		this.definitions = definitions;
	}

	@Override
	public String toString() {
		return "Program [line=" + line + ", column=" + column + "]";
	}
	
	

	
}
