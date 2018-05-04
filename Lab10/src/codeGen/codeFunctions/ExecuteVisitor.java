package codeGen.codeFunctions;

import ast.Program;
import ast.program.definitions.FuncDefinition;
import ast.program.definitions.VarDefinition;
import ast.program.statements.Assignment;
import ast.program.statements.IfStmnt;
import ast.program.statements.Read;
import ast.program.statements.ReturnStmnt;
import ast.program.statements.WhileStmnt;
import ast.program.statements.Write;
import ast.program.types.primitive.VoidType;
import visitor.AbstractCGVisitor;

public class ExecuteVisitor extends AbstractCGVisitor<FuncDefinition, Void> {

	private CodeFunctions cfs = CodeFunctions.getInstance();
	
	@Override
	public Void visit(Read readStmnt, FuncDefinition param) {
		cg.log("Read stmnt");
		readStmnt.accept(cg.address, null);
		cg.in(readStmnt.exp.getType().getSuffix());
		cg.store(readStmnt.exp.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(Write writeStmnt, FuncDefinition param) {
		cg.log("Write stmnt");
		// push implicit
		writeStmnt.accept(this, param);
		cg.out(writeStmnt.expression.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(Program program, FuncDefinition param) {
		cg.invocationToMain();
		cg.log("Global variables");
		program.definitions.stream()
			.filter(def -> def instanceof FuncDefinition)
			.map(def -> def.accept(this, param));
		return null;
	}

	@Override
	public Void visit(Assignment assign, FuncDefinition param) {

		return null;
	}

	@Override
	public Void visit(FuncDefinition funcDef, FuncDefinition param) {
		cg.log("Function Definition");
		cg.call(funcDef.name);
		cg.log("Parameters");
		funcDef.getType().accept(this, param);
		cg.log("Local Variables");
		funcDef.body.stream()
			.filter(fd -> fd instanceof VarDefinition)
			.map(fd -> fd.accept(this, param));
		cg.enter(funcDef.totalLocalBytes);
		funcDef.body.stream()
			.filter(fd -> !(fd instanceof VarDefinition))
			.map(fd -> fd.accept(this, funcDef));
		if(funcDef.getType() instanceof VoidType) {
			cg.ret(0,funcDef.totalLocalBytes,funcDef.totalBytesParam);
		}
		return null;
	}
	
	@Override
	public Void visit(ReturnStmnt retStmnt, FuncDefinition param) {
		cg.ret(retStmnt.exp.getType().getNumberOfBytes(), param.totalLocalBytes, param.totalBytesParam);
		return null;
	}
	
	@Override
	public Void visit(IfStmnt ifStmnt, FuncDefinition param) {
		int label = cg.getLabels(2);
		ifStmnt.accept(cfs.getValue(), param);
		cg.jz(label);
		ifStmnt.ifStmnts.forEach(s -> s.accept(cfs.getExecute(), param));
		cg.jmp(++label);
		cg.label(label);
		ifStmnt.elseStmnts.forEach(s -> s.accept(cfs.getExecute(), param));
		cg.label(++label);
		return null;
	}
	
	@Override
	public Void visit(WhileStmnt whileStmnt, FuncDefinition param) {
		int label = cg.getLabels(2);
		cg.log("Label"+label);
		cg.label(label);
		whileStmnt.accept(cfs.getValue(), param);
		cg.jz(++label);
		whileStmnt.stmnts.forEach(s -> s.accept(cfs.getExecute(), param));
		cg.jmp(label);
		cg.log("Label"+(++label));
		cg.label(++label);
		return null;
	}
}
