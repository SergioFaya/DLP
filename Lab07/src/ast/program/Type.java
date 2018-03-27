package ast.program;

import java.util.List;

import ast.ASTNode;

public interface Type extends ASTNode{
	
	boolean isLogical();
	
	Type arithmetic(Type t);
	
	Type comparison(Type t);
	
	//field acess
	Type dot(String str);
	//indexing
	Type squareBrackets(Type t);
	
	//invocation
	Type parenthesis(List<String> str);

}
