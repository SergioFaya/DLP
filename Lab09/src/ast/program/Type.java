package ast.program;

import java.util.List;

import ast.ASTNode;

public interface Type extends ASTNode{
	
	public boolean isLogical();
	
	public boolean isBuiltInType();
	
	public Type arithmetic(Type t);
	
	public Type arithmetic();
	
	public Type comparison(Type t);

	public Type logical();
	
	public Type logical(Type t);
	
	public Type cast(Type t);
	
	//field acess
	public Type dot(String str);

	//indexing
	public Type squareBrackets(Type t);
	
	public Type promotesTo(Type t);

	//invoke
	public Type parenthesis(List<Type> types);
	
	public int getSize();
	
	public int getOffset();
	
	public void setOffset(int offset);
	


}
