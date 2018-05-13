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
		readStmnt.exp.accept(cfs.getAddress(), null);
		cg.in(readStmnt.exp.getType().getSuffix());
		cg.store(readStmnt.exp.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(Write writeStmnt, FuncDefinition param) {
		cg.log("Write stmnt");
		writeStmnt.expression.accept(cfs.getValue(), param);
		cg.out(writeStmnt.expression.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(Program program, FuncDefinition param) {
		cg.log("Global variables");
		program.definitions.stream()
			.filter(def -> def instanceof VarDefinition)
			.forEach(def -> def.accept(this, param));
		cg.invocationToMain();
		program.definitions.stream()
			.filter(def -> def instanceof FuncDefinition)
			.forEach(def -> def.accept(this, param));
		return null;
	}

	@Override
	public Void visit(Assignment assign, FuncDefinition param) {
		cg.log("Assignment statement");
		assign.expLeft.accept(cfs.getAddress(), param);
		assign.expRight.accept(cfs.getValue(), param);
		cg.store(assign.expLeft.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(FuncDefinition funcDef, FuncDefinition param) {
		cg.log("Function Definition");
		int label = cg.getLabels(1);
		cg.label(label);
		cg.log("Parameters");
		funcDef.getType().accept(this, param);
		cg.log("Local Variables");
		funcDef.body.stream()
			.filter(fd -> fd instanceof VarDefinition)
			.forEach(fd -> fd.accept(this, param));
		cg.enter(funcDef.getTotalBytesParam());
		funcDef.body.stream()
			.filter(fd -> !(fd instanceof VarDefinition))
			.forEach(fd -> fd.accept(this, funcDef));
		if(funcDef.getType() instanceof VoidType) {
			cg.ret(0,funcDef.totalLocalBytes,funcDef.totalBytesParam);
		}
		return null;
	}
	
	@Override
	public Void visit(ReturnStmnt retStmnt, FuncDefinition param) {
		cg.log("Execution of return statement");
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
	
	@Override
	public Void visit(VarDefinition varDef, FuncDefinition param) {
		cg.log(varDef.getType()+" "+ varDef.getName() + " offset:"+ varDef.getOffset());
		return null;
	}
}
