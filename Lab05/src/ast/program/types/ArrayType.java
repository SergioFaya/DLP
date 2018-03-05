package ast.program.types;

import java.util.Arrays;
import java.util.List;

import ast.AbstractASTNode;
import ast.program.Type;

public class ArrayType extends AbstractASTNode implements Type {

	private List<Integer> dimensions;
	public Type type;
	public Object[] array;
	
	public ArrayType(int line, int column,Type type, List<Integer> dimensions) {
		super(line, column);
		this.dimensions = dimensions;
		this.type = type;
		createArrays();
	}
	
	private void createArrays() {
		int init = 0;
		Object[] arr = new Object[dimensions.get(init)];
		if( init+1 < dimensions.size()) {
			createDim(arr,init+1,dimensions);
		}else {
			this.array = arr;
		}
	}
	
	private void createDim(Object[] arr,int dimensionIndex ,List<Integer> dimensions){
		Object[] aux  = new Object[dimensions.get(dimensionIndex-1)];
		for (int i = 0; i<arr.length; i++) {
			aux[i] = new Object[dimensions.get(dimensionIndex)];
			if( dimensionIndex+1 < dimensions.size()) {
				createDim((Object[]) aux[i], dimensionIndex+1,dimensions);
			}
		}
		this.array = aux;
	}

	@Override
	public String toString() {
		return "ArrayType [dimensions=" + dimensions + ", type=" + type + ", array=" + Arrays.toString(array)
				+ ", line=" + line + ", column=" + column + "]";
	}
	
	

}
