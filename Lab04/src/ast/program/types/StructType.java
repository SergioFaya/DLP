package ast.program.types;

import java.util.List;

import ast.AbstractASTNode;
import ast.program.Type;
import ast.program.definitions.RecordDef;

public class StructType extends AbstractASTNode implements Type {

	public List<RecordDef> rdefs;

	public StructType(int line, int column,List<RecordDef> rdefs) {
		super(line, column);
		this.rdefs =rdefs;
	}

	@Override
	public String toString() {
		return "StructType [rdefs=" + rdefs + ", line=" + line + ", column=" + column + "]";
	}

	
}
