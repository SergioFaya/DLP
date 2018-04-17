package codegenerator;

import ast.Program;
import ast.program.definitions.Field;
import ast.program.definitions.FuncDefinition;
import ast.program.definitions.VarDefinition;
import ast.program.types.ArrayType;
import ast.program.types.FuncType;
import ast.program.types.StructType;
import ast.program.types.primitive.CharType;
import ast.program.types.primitive.IntType;
import ast.program.types.primitive.RealType;
import ast.program.types.primitive.VoidType;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Void>{

	@Override
	public Void visit(Program program, Void param) {
		program.definitions.forEach(def->def.accept(this, param));
		return null;
	}
	
	@Override
	public Void visit(VarDefinition varDef, Void param) {
		varDef.getType().accept(this, param);
		return null;
	}
	
	@Override
	public Void visit(CharType charType, Void param) {
		return null;
	}
	
	@Override
	public Void visit(ArrayType arrayType, Void param) {
		arrayType.setOffset(arrayType.getSize()*arrayType.type.getOffset());
		arrayType.type.accept(this, param);
		return null;
	}
	
	@Override
	public Void visit(FuncType funcType, Void param) {
		funcType.returnType.accept(this, param);
		int count = 0;
		for ( VarDefinition vd : funcType.params) {
			// NOT PROPAGATE TO CHILDREN
			count += vd.getOffset();
		}
		funcType.setOffset(count);
		return null;
	}
	
	@Override
	public Void visit(IntType intType, Void param) {
		return null;
	}
	
	@Override
	public Void visit(VoidType voidType, Void param) {
		return null;
	}
	
	@Override
	public Void visit(RealType real, Void param) {
		return null;
	}
	
	@Override
	public Void visit(StructType structType, Void param) {
		int offset = 0;
		for (Field f : structType.fields) {
			offset += f.getOffset();
			f.accept(this, param);
		}
		structType.setOffset(offset);
		return null;
	}
	
	@Override
	public Void visit(FuncDefinition funcDef, Void param) {
		funcDef.getType().accept(this, param);
		funcDef.body.forEach(st -> st.accept(this, param));
		return null;
	}
}
