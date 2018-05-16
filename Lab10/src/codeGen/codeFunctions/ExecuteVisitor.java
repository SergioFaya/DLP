package codeGen.codeFunctions;

import ast.Program;
import ast.program.Expression;
import ast.program.definitions.FuncDefinition;
import ast.program.definitions.VarDefinition;
import ast.program.expstmnt.FunctionInvocation;
import ast.program.statements.Assignment;
import ast.program.statements.IfStmnt;
import ast.program.statements.Read;
import ast.program.statements.ReturnStmnt;
import ast.program.statements.WhileStmnt;
import ast.program.statements.Write;
import ast.program.types.FuncType;
import ast.program.types.primitive.VoidType;
import codeGen.CodeGenerator;
import visitor.AbstractCGVisitor;

public class ExecuteVisitor extends AbstractCGVisitor<FuncDefinition, Void> {

	public ExecuteVisitor(CodeGenerator cg) {
		super(cg);
	}

	@Override
	public Void visit(Program program, FuncDefinition param) {
		cg.println();
		cg.source();
		//cg.line(program.getLine());
		//cg.log("Global variables");
		cg.println();
		program.definitions.stream().filter(def -> def instanceof VarDefinition)
				.forEach(def -> def.accept(this, param));
		cg.invocationToMain();
		program.definitions.stream().filter(def -> def instanceof FuncDefinition)
				.forEach(def -> def.accept(this, param));
		return null;
	}
	
	@Override
	public Void visit(Read readStmnt, FuncDefinition param) {
		cg.line(readStmnt.getLine());
		cg.log("Read");
		readStmnt.exp.accept(CodeFunctions.getAddress(), null);
		cg.in(readStmnt.exp.getType().getSuffix());
		cg.store(readStmnt.exp.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(Write writeStmnt, FuncDefinition param) {
		cg.line(writeStmnt.getLine());
		cg.log("Write");
		writeStmnt.expression.accept(CodeFunctions.getValue(), param);
		cg.out(writeStmnt.expression.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(Assignment assign, FuncDefinition param) {
		cg.line(assign.getLine());
		cg.log("Assignment statement");
		assign.getExpLeft().accept(CodeFunctions.getAddress(), param);
		assign.getExpRight().accept(CodeFunctions.getValue(), param);
		cg.store(assign.getExpLeft().getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(FuncDefinition funcDef, FuncDefinition param) {
		cg.line(funcDef.getLine());
		cg.log("Function Definition");
		if(funcDef.getName().equals("main")) {
			cg.label("main");
		}else {
			int label = cg.getLabels(1);
			cg.label(label);
		}
		cg.log("Parameters");
		FuncType funcType = (FuncType) funcDef.getType();
		for (int i = funcType.params.size() - 1; i >= 0; i--) {
			VarDefinition vd = funcType.params.get(i);
			vd.accept(this, param);
		}
		cg.log("Local variables");
		funcDef.body.stream().filter(fd -> fd instanceof VarDefinition).forEach(fd -> fd.accept(this, param));
		cg.enter(funcDef.getLocalBytesSum());
		funcDef.body.stream()
		.filter(fd -> !(fd instanceof VarDefinition))
		.forEach(fd -> fd.accept(this, funcDef));
		if (( (FuncType) funcDef.getType()).returnType instanceof VoidType) {
			cg.ret(0, funcDef.getLocalBytesSum(), funcDef.getTotalBytesParam());
		}
		return null;
	}

	@Override
	public Void visit(ReturnStmnt retStmnt, FuncDefinition param) {
		cg.line(retStmnt.getLine());
		cg.log("Execution of return statement");
		retStmnt.exp.accept(CodeFunctions.getValue(), param);
		cg.ret(retStmnt.exp.getType().getNumberOfBytes(), param.getLocalBytesSum(), param.getTotalBytesParam());
		return null;
	}

	@Override
	public Void visit(IfStmnt ifStmnt, FuncDefinition param) {
		cg.line(ifStmnt.getLine());
		cg.log("Execution of if");
		int label = cg.getLabels(2);
		ifStmnt.exp.accept(CodeFunctions.getValue(), param);
		cg.jz(label);
		ifStmnt.ifStmnts.forEach(s -> s.accept(CodeFunctions.getExecute(), param));
		cg.jmp(label+1);
		cg.label(label);
		ifStmnt.elseStmnts.forEach(s -> s.accept(CodeFunctions.getExecute(), param));
		cg.label(label+1);
		return null;
	}

	@Override
	public Void visit(WhileStmnt whileStmnt, FuncDefinition param) {
		cg.line(whileStmnt.getLine());
		cg.log("Execution of while");
		int label = cg.getLabels(2);
		cg.log("Label" + label);
		cg.label(label);
		whileStmnt.exp.accept(CodeFunctions.getValue(), param);
		cg.jz(++label);
		whileStmnt.stmnts.forEach(s -> s.accept(CodeFunctions.getExecute(), param));
		cg.jmp(label);
		cg.log("Label" + (++label));
		cg.label(++label);
		return null;
	}

	@Override
	public Void visit(VarDefinition varDef, FuncDefinition param) {
		String type = null;
		String simplename= varDef.getType().getClass().getSimpleName();
		switch(simplename) {
		case "IntType":
			type = "int";
			break;
		case "CharType":
			type = "char";
			break;
		case "RealType":
			type = "real";
			break;
		default:
			type = simplename;
			break;
		}
		cg.log(type + " " + varDef.getName() + " (offset " + varDef.getOffset() + ")");
		return null;
	}
	
	@Override
	public Void visit(FunctionInvocation functType, FuncDefinition param) {
		cg.line(functType.getLine());
		cg.log("Execute functinvocation");
		functType.params.forEach(p -> p.accept(CodeFunctions.getValue(), param));
		cg.call(functType.variable.name);
		Expression fexpr = (Expression) functType;
		if(!(fexpr.getType() instanceof VoidType)) {
			cg.pop(fexpr.getType().getSuffix());
		}
		return null;
	}
}
