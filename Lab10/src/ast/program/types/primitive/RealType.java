package ast.program.types.primitive;

import ast.program.Type;
import ast.program.types.AbstractType;
import ast.program.types.ErrorType;
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
		if(t instanceof IntType) {
			return t; 
		}else if(t instanceof CharType){
			return t; 
		}else if (t instanceof RealType){
			return this;
		}
		return null;
	}

	@Override
	public boolean isEquivalent(Type t) {
		if(t instanceof RealType || t instanceof ErrorType) {
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
