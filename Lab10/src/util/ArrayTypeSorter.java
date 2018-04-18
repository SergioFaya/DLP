package util;

import java.util.List;

import ast.program.Type;
import ast.program.types.ArrayType;

public class ArrayTypeSorter {

	public static ArrayType sort(int line, int column, Type type, List<Integer> dimensions) {
		ArrayType t = new ArrayType(line, column, type, dimensions.get(dimensions.size() -1));
		for(int i = dimensions.size() - 2;i >= 0 ; i--) {
			ArrayType aux = new ArrayType(line, column, t, dimensions.get(i));
			t = aux;
		}
		return t;
	}
}
