package ast.program.types.primitive;

import ast.AbstractASTNode;
import ast.program.Type;

public class IntType extends AbstractASTNode implements Type {

public static IntType instance = new IntType(); 
	
	private IntType() {
		super(-1,-1);
	}
	
	public static IntType getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "IntType [line=" + line + ", column=" + column + "]";
	}

	
}
