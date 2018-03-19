package ast.program.types;

import ast.AbstractASTNode;
import ast.program.Type;
import visitor.Visitor;

public class ArrayType extends AbstractASTNode implements Type {

	public Type type;
	public int size;
	
	public ArrayType(int line, int column, Type type, Integer size) {
		super(line, column);
		this.size = size;
		this.type = type;
		orderTypes();
	}

	@Override
	public String toString() {
		return "ArrayType [type=" + type + ", size=" + size + ", line=" + line + ", column=" + column + "]";
	}

	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
	
	@Override
	public Type getType() {
		return type;
	}
	
	private void orderTypes() {
		Type aux = this.type;
		while (aux.getType()!=null) {
			aux= aux.getType();
		}
		this.type = aux;
	}
}
