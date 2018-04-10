package ast.program.types.primitive;

import ast.program.Type;
import ast.program.types.AbstractType;
import visitor.Visitor;

public class CharType extends AbstractType{

	public static CharType instance = new CharType(); 
	
	private CharType() {
		super(-1,-1);
	}
	
	public static CharType getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "CharType [line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
	
	@Override
	public Type arithmetic(Type t) {
		if (t == CharType.getInstance()) {
			return this;
		}
		return null;
	}
	
	@Override
	public Type arithmetic() {
		return this;
	}
	
	@Override
	public Type logical(Type t) {		
		if(t == CharType.getInstance()) {
			return this;
		}
		return null;
	}
	
	@Override
	public Type logical() {
		return this;
	}
	
	@Override
	public Type cast(Type t) {
		if(t == CharType.getInstance()) {
			return this;
		}
		return null;
	}
	
	@Override
	public Type promotesTo(Type t) {
		if (t == CharType.getInstance()) {
			return this;
		}
		return null;
	}
	
	@Override
	public Type comparison(Type t) {
		if(t == CharType.getInstance()) {
			return this;
		}
		return null;
	}
}
