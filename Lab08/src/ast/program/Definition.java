package ast.program;

import ast.ASTNode;

public interface Definition extends ASTNode{
	
	Type getType();
	
	String getName();
	
	int getScope();
	
	void setScope(int scope);
}
