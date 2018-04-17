package ast.program.types;

import ast.program.Type;
import ast.program.types.primitive.IntType;
import visitor.Visitor;

public class ArrayType extends AbstractType {

	public Type type;
	public int size;
	private int offset;
	
	public ArrayType(int line, int column, Type type, Integer size) {
		super(line, column);
		this.size = size;
		this.type = type;
	}

	@Override
	public String toString() {
		return "ArrayType [type=" + type + ", size=" + size + ", offset=" + offset + "]";
	}

	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
	
	@Override
	public Type squareBrackets(Type t) {
		if(t == IntType.getInstance()) {
			return this;
		}else {
			return super.squareBrackets(t);
		}
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
