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

	@Override
	public Void visit(Read readStmnt, FuncDefinition param) {
		cg.println("'*Read stmnt");
		readStmnt.accept(cg.address, null);
		cg.print("in");
		cg.println(readStmnt.exp.getType().getSuffix());
		cg.print("store");
		cg.println(readStmnt.exp.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(Write writeStmnt, FuncDefinition param) {
		cg.println("'*Write stmnt");
		// push implicit
		writeStmnt.accept(this, param);
		cg.print("out");
		cg.println(writeStmnt.expression.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(Program program, FuncDefinition param) {
		cg.invocationToMain();
		cg.println("*Global variables");
		program.definitions.stream().filter(def -> def instanceof FuncDefinition)
				// execute funcdef
				.map(def -> def.accept(this, param));
		return null;

	}

	@Override
	public Void visit(Assignment assign, FuncDefinition param) {

		return null;
	}

	@Override
	public Void visit(FuncDefinition funcDef, FuncDefinition param) {
		cg.println("'*Function Definition");
		cg.print(funcDef.name);
		cg.println(":");
		cg.println("'Parameters");
		funcDef.getType().accept(this, param);
		cg.println("'Local Variables");
		funcDef.body.stream().filter(fd -> fd instanceof VarDefinition).map(fd -> fd.accept(this, param));
		cg.enter(funcDef.totalLocalBytes);
		funcDef.body.stream().filter(fd -> !(fd instanceof VarDefinition)).map(fd -> fd.accept(this, funcDef));
		if(funcDef.getType() instanceof VoidType) {
			cg.ret(0,funcDef.totalLocalBytes,funcDef.totalBytesParam);
		}
		return null;
	}
	
	@Override
	public Void visit(ReturnStmnt retStmnt, FuncDefinition param) {
		cg.print("ret ");
		cg.print(retStmnt.exp.getType().getNumberOfBytes());
		cg.print(",");
		cg.print(param.totalLocalBytes);
		cg.print(",");
		cg.println(param.totalBytesParam);
		return null;
	}
	
	@Override
	public Void visit(IfStmnt ifStmnt, FuncDefinition param) {
		return null;
	}
	
	@Override
	public Void visit(WhileStmnt whileStmnt, FuncDefinition param) {
		int label = cg.getLabels(2);
		cg.print("label ");
		cg.print(label);
		cg.print(":");
		//whileStmnt.accept(
		return null;
	}
}
