package ast.program.types.primitive;

import ast.program.types.AbstractType;
import visitor.Visitor;

public class RealType extends AbstractType {

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
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
