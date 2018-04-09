package ast.program;

import ast.ASTNode;

public interface Expression extends ASTNode{

	boolean getLvalue();
	
	void setLvalue(boolean lValue);
	
	Type setType(Type type);
	
	Type getType();
}
