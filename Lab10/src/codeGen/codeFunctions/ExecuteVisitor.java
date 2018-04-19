package codeGen.codeFunctions;

import ast.Program;
import ast.program.definitions.FuncDefinition;
import ast.program.definitions.VarDefinition;
import ast.program.statements.Assignment;
import ast.program.statements.Read;
import ast.program.statements.Write;
import ast.program.types.primitive.VoidType;

public class ExecuteVisitor extends AbstractCGVisitor<Void, Void> {

	private AddressVisitor address = new AddressVisitor();

	@Override
	public Void visit(Read readStmnt, Void param) {
		cg.println("'*Read stmnt");
		readStmnt.accept(address, param);
		cg.print("in");
		cg.println(readStmnt.exp.getType().getSuffix());
		cg.print("store");
		cg.println(readStmnt.exp.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(Write writeStmnt, Void param) {
		cg.println("'*Write stmnt");
		// push implicit
		writeStmnt.accept(this, param);
		cg.print("out");
		cg.println(writeStmnt.expression.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(Program program, Void param) {
		cg.invocationToMain();
		cg.println("*Global variables");
		program.definitions.stream().filter(def -> def instanceof FuncDefinition)
				// execute funcdef
				.map(def -> def.accept(this, param));
		return null;

	}

	@Override
	public Void visit(Assignment assign, Void param) {

		return null;
	}

	@Override
	public Void visit(FuncDefinition funcDef, Void param) {
		cg.println("'*Function Definition");
		cg.print(funcDef.name);
		cg.println(":");
		cg.println("'Parameters");
		funcDef.getType().accept(this, param);
		cg.println("'Local Variables");
		funcDef.body.stream().filter(fd -> fd instanceof VarDefinition).map(fd -> fd.accept(this, param));
		cg.enter(funcDef.totalLocalBytes);
		funcDef.body.stream().filter(fd -> !(fd instanceof VarDefinition)).map(fd -> fd.accept(this, param));
		if(funcDef.getType() instanceof VoidType) {
			cg.ret(0,funcDef.totalLocalBytes,funcDef.totalBytesParam);
		}
		return null;
	}
}
