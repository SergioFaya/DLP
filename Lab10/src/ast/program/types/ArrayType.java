package ast.program.types;

import ast.program.Type;
import ast.program.types.primitive.IntType;
import visitor.Visitor;

public class ArrayType extends AbstractType {

	public Type type;
	public int size;

	public ArrayType(int line, int column, Type type, Integer size) {
		super(line, column);
		this.size = size;
		this.type = type;
	}

	@Override
	public String toString() {
		return "ArrayType [type=" + type + ", size=" + size + "]";
	}

	public static ArrayType insertArrayType(int line, int column, Type type, int size) {
		if (type instanceof ArrayType) {
			ArrayType it = (ArrayType) type;
			ArrayType root = (ArrayType) type;
			while (root.type instanceof ArrayType)
				root = (ArrayType) root.type;
			root.type = new ArrayType(line, column, root.type, size);
			return it;
		} else
			return new ArrayType(line, column, type, size);
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

	@Override
	public Type squareBrackets(Type t) {
		if (t == IntType.getInstance()) {
			return this;
		}
		return null;
	}

	@Override
	public int getNumberOfBytes() {
		return size * type.getNumberOfBytes();
	}

	@Override
	public String getSuffix() {
		throw new RuntimeException();
	}
}
