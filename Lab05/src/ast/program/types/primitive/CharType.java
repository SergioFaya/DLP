package ast.program.types.primitive;

import ast.AbstractASTNode;
import ast.program.Type;

public class CharType extends AbstractASTNode implements Type{

	public static CharType instance = new CharType(); 
	
	private CharType() {
		super(-1,-1);
	}
	
	public static CharType getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "CharType [line=" + line + ", column=" + column + "]";
	}
	
	
}
