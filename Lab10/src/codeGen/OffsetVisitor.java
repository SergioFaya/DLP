package codeGen;

import ast.program.definitions.Field;
import ast.program.definitions.FuncDefinition;
import ast.program.definitions.VarDefinition;
import ast.program.types.FuncType;
import ast.program.types.RecordType;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Void> {

	private int localVarOffset = 0;
	private int globalVarOffset = 0;

	@Override
	public Void visit(RecordType structType, Void param) {
		int bytesFieldSum = 0;
		for (Field f : structType.fields) {
			f.setOffset(bytesFieldSum);
			bytesFieldSum += f.getType().getNumberOfBytes();
		}
		return null;
	}

	@Override
	public Void visit(VarDefinition varDef, Void param) {
		if (varDef.getScope() == 0) {
			varDef.setOffset(globalVarOffset);
			globalVarOffset += varDef.getType().getNumberOfBytes();
		} else {
			localVarOffset -= varDef.getType().getNumberOfBytes();
			varDef.setOffset(localVarOffset);
		}
		return null;
	}

	@Override
	public Void visit(FuncDefinition funcDef, Void param) {
		localVarOffset = 0;
		// funcDef.getType().accept(this, param);
		funcDef.body.stream()
			.filter(st -> st instanceof VarDefinition)
			.forEach(st -> st.accept(this, param));
		funcDef.setLocalBytesSum(localVarOffset);

		return null;
	}

	@Override
	public Void visit(FuncType funcType, Void param) {
		int bytesFieldSum = 4;
		VarDefinition vd = null;
		for (int i = funcType.params.size() - 1; i >= 0; i--) {
			vd = funcType.params.get(i);
			vd.setOffset(bytesFieldSum);
			bytesFieldSum += vd.getType().getNumberOfBytes();
		}
		return null;
	}

}
