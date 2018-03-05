package ast.program.types;

import java.util.List;

import ast.AbstractASTNode;
import ast.program.Type;
import ast.program.definitions.VarDefinition;

public class FuncType extends AbstractASTNode implements Type {

	public Type type;
	public List<VarDefinition> defs;

	public FuncType(int line, int column, Type type, List<VarDefinition> defs) {
		super(line, column);
		this.type =type;
		this.defs=defs;
	}

	@Override
	public String toString() {
		return "FuncType [type=" + type + ", defs=" + defs + ", line=" + line + ", column=" + column + "]";
	}

	
}
