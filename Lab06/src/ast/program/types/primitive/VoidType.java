package ast.program.types.primitive;

import ast.AbstractASTNode;
import ast.program.Type;
import visitor.Visitor;

public class VoidType extends AbstractASTNode implements Type {

	public static VoidType instance = new VoidType();

	private VoidType() {
		super(-1,-1);
	}

	public static VoidType getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "VoidType [line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

}
