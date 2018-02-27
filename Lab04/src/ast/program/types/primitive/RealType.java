package ast.program.types.primitive;

import ast.AbstractASTNode;
import ast.program.Type;

public class RealType extends AbstractASTNode implements Type {

	public static RealType instance = new RealType();

	private RealType() {
		super(-1,-1);
	}

	public static RealType getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "RealType [line=" + line + ", column=" + column + "]";
	}
	
	

}
