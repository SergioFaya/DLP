  package ast;

import java.util.List;

import ast.program.Definition;
import visitor.Visitor;

public class Program extends AbstractASTNode{
	
	public List<Definition> definitions;

	public Program(int line, int column, List<Definition> definitions) {
		super(line,column);
		this.definitions = definitions;
	}

	@Override
	public String toString() {
		return "Program [definitions=" + definitions + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}	
}
