package ast.program.types.primitive;

import ast.program.Type;
import ast.program.types.AbstractType;
import visitor.Visitor;

public class IntType extends AbstractType {

	public static IntType instance = new IntType();
	
	private IntType() {
		super(-1, -1);
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

	@Override
	public Type arithmetic(Type t) {
		if (t == IntType.getInstance()) {
			return this;
		}
		//Return null, the null is received in the visitor and the error is shown there
		return super.arithmetic(t);
	}

	@Override
	public Type arithmetic() {
		return this;
	}

	@Override
	public Type logical(Type t) {
		if (t == IntType.getInstance()) {
			return this;
		}
		return super.logical(t);
	}
	
	@Override
	public Type logical() {
		return this;
	}
	
	@Override
	public Type cast(Type t) {
		if(t instanceof IntType) {
			return this;
		}else if(t instanceof CharType){
			return t; 
		}else if (t instanceof RealType){
			return t;
		}
		return null;
	}

	@Override
	public Type comparison(Type t) {
		if(t instanceof IntType) {
			return t;
		}
		return null;
	}
	
	@Override
	public boolean isEquivalent(Type t) {
		if(t instanceof IntType ) {
			return true; 
		}
		return false;
	}
	
	@Override
	public int getNumberOfBytes() {
		return 2;
	}
	
	@Override
	public String getSuffix() {
		return "i";
	}
	
}
