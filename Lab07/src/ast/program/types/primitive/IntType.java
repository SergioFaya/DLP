package ast.program.types.primitive;

import ast.program.types.AbstractType;
import visitor.Visitor;

public class IntType extends AbstractType {

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

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
	
	@Override
	public boolean isLogical() {
		return true;
	}
}
