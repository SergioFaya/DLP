package ast.program.types;

import java.util.List;

import ast.AbstractASTNode;
import ast.program.Type;

public class ArrayType extends AbstractASTNode implements Type {

	public Type type;
	public int dimension;
	
	public ArrayType(int line, int column, Type type, List<Integer> dimensions) {
		super(line, column);
		this.dimension = dimensions.get(dimensions.size()-1);
		this.type = type;
	}

	@Override
	public String toString() {
		return "ArrayType [type=" + type + ", dimension=" + dimension + ", line=" + line + ", column=" + column + "]";
	}

}
