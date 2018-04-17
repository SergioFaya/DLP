package ast.program.types.primitive;

import ast.program.Type;
import ast.program.types.AbstractType;
import visitor.Visitor;

public class RealType extends AbstractType {

	public static RealType instance = new RealType();
	private int offset;
	
	private RealType() {
		super(-1, -1);
	}

	public static RealType getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "RealType [offset=" + offset + "]";
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
	public Type logical() {
		return this;
	}

	@Override
	public Type cast(Type t) {
		if (t == RealType.getInstance()) {
			return this;
		}
		return null;
	}

	@Override
	public Type promotesTo(Type t) {
		if (t == RealType.getInstance()) {
			return this;
		}
		return null;
	}

	@Override
	public Type comparison(Type t) {
		if (t == RealType.getInstance()) {
			return this;
		}
		return null;
	}

	@Override
	public int numberOfBytes() {
		return 4;
	}
	
}
