package ast.program;

import ast.program.types.Type;

public interface Definition {
	
	Type getType();
	
	String getName();
}
