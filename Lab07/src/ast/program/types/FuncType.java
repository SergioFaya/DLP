package ast.program.types;

import java.util.List;

import ast.AbstractASTNode;
import ast.program.Type;
import ast.program.definitions.VarDefinition;
import visitor.Visitor;

public class FuncType extends AbstractASTNode implements Type {

	public Type returnType;
	public List<VarDefinition> params;

	public FuncType(int line, int column, Type returnType, List<VarDefinition> params) {
		super(line, column);
		this.returnType =returnType;
		this.params=params;
	}

	@Override
	public String toString() {
		return "FuncType [returnType=" + returnType + ", params=" + params + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

	@Override
	public Type getType() {
		return returnType;
	}
	
	
}
