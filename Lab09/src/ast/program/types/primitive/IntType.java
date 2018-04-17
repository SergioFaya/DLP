package ast.program.types.primitive;

import ast.program.Type;
import ast.program.types.AbstractType;
import visitor.Visitor;

public class IntType extends AbstractType {

	public static IntType instance = new IntType();
	private int offset;
	
	private IntType() {
		super(-1, -1);
	}

	public static IntType getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "IntType [offset=" + offset + "]";
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
		if(t == IntType.getInstance()) {
			return this;
		}
		return null;
	}
	
	@Override
	public Type promotesTo(Type t) {
		if(t == IntType.getInstance()) {
			return this;
		}
		return null;
	}
	
	@Override
	public int getSize() {
		return 2;
	}
	
	@Override
	public int getOffset() {
		return this.offset;
	}

	@Override
	public void setOffset(int offset) {
		this.offset=offset;
	}

	
}
