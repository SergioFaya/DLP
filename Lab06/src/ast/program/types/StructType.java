package ast.program.types;

import java.util.List;

import ast.AbstractASTNode;
import ast.program.Type;
import ast.program.definitions.Field;
import visitor.Visitor;

public class StructType extends AbstractASTNode implements Type {

	public List<Field> rdefs;

	public StructType(int line, int column,List<Field> rdefs) {
		super(line, column);
		this.rdefs =rdefs;
	}

	@Override
	public String toString() {
		return "StructType [rdefs=" + rdefs + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
