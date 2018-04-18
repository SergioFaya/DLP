package ast.program.types;

import java.util.List;

import ast.program.Type;
import ast.program.definitions.VarDefinition;
import visitor.Visitor;

public class FuncType extends AbstractType {

	public Type returnType;
	public List<VarDefinition> params;
	private int numberOfBytes;
	
	public FuncType(int line, int column, Type returnType, List<VarDefinition> params) {
		super(line, column);
		this.returnType = returnType;
		this.params = params;
	}

	@Override
	public String toString() {
		return "FuncType [returnType=" + returnType + ", params=" + params + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

	@Override
	public Type parenthesis(List<Type> types) {
		if (types.size() != params.size()) {
			return null;
		}
		for (int i = 0; i < types.size(); i++) {
			if (types.get(i).promotesTo(params.get(i).getType()) == null) {
				return null;
			}
		}
		return returnType;
	}

	@Override
	public int getNumberOfBytes() {
		return numberOfBytes;
	}
	
	@Override
	public void setNumberOfBytes(int bytes) {
		this.numberOfBytes = bytes;
	}
}
