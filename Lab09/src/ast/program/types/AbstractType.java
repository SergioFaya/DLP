package ast.program.types;

import java.util.List;

import ast.AbstractASTNode;
import ast.program.Type;

public abstract class AbstractType extends AbstractASTNode implements Type {

	public AbstractType(int line, int column) {
		super(line, column);
	}
	
	@Override
	public boolean isLogical() {
		return false;
	}
	
	@Override
	public boolean isBuiltInType() {
		return false;
	}
	
	//The null is evaluated in the typechecking visitor, the error is thrown there
	@Override
	public Type arithmetic(Type t) {
		return null;
	}

	@Override
	public Type comparison(Type t) {
		return null;
	}

	@Override
	public Type logical(Type t) {
		return null;
	}
	
	@Override
	public Type cast(Type t) {
		return null;
	}
	
	@Override
	public Type dot(String str) {
		return null;
	}

	@Override	
	public Type squareBrackets(Type t) {
		return null;
	}

	@Override
	public Type parenthesis(List<Type> types) {
		return null;
	}
	
	@Override
	public Type promotesTo(Type t) {
		return null;
	}
	
	@Override
	public Type arithmetic() {
		return null;
	}
	
	@Override
	public Type logical() {
		return null;
	}
	
	@Override
	public int getNumberOfBytes() {
		throw new RuntimeException("Implementation not created");
	}
	
	@Override
	public void setNumberOfBytes(int bytes) {
		throw new RuntimeException("Implementation not created");
	}

	@Override
	public String toString() {
		return "AbstractType [line=" + line + ", column=" + column + "]";
	}
}
