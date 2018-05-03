package ast.program.types.primitive;

import ast.program.Type;
import ast.program.types.AbstractType;
import visitor.Visitor;

public class RealType extends AbstractType {

	public static RealType instance = new RealType();

	
	private RealType() {
		super(-1, -1);
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

	@Override
	public Type arithmetic(Type t) {
		if (t == RealType.getInstance()) {
			return this;
		}
		return super.arithmetic(t);
	}

	@Override
	public Type arithmetic() {
		return this;
	}

	@Override
	public Type logical(Type t) {
		if (t == RealType.getInstance()) {
			return this;
		}
		return null;
	}


	@Override
	public Type cast(Type t) {
		//Cannot cast to int or char because of information lost
		if (t == RealType.getInstance()) {
			return this;
		}
		return null;
	}

	@Override
	public boolean isEquivalent(Type t) {
		if(t instanceof RealType) {
			return true; 
		}
		return false;
	}

	@Override
	public Type comparison(Type t) {
		if (t == RealType.getInstance()) {
			return this;
		}
		return null;
	}

	@Override
	public int getNumberOfBytes() {
		return 4;
	}
	
	@Override
	public String getSuffix() {
		return "f";
	}
}
