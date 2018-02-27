package ast;

import java.util.List;

import ast.program.Definition;

public class Program extends AbstractASTNode{
	

	public List<Definition> definitions;
	//public FuncDefinition main;
	
	
	/*
	public Program(int line, int column, List<Definition> definitions, FuncDefinition main) {
		super(line,column);
		this.definitions = definitions;
		this.main = main;
	}
	*/
	public Program(int line, int column, List<Definition> definitions) {
		super(line,column);
		this.definitions = definitions;
	}


	@Override
	public String toString() {
		return "Program [definitions=" + definitions + ", line=" + line + ", column=" + column + "]";
	}

//	@Override
//	public String toString() {
//		return "Program [definitions=" + definitions + ", main=" + main + ", line=" + line + ", column=" + column + "]";
//	}
	
	
	

	
}
