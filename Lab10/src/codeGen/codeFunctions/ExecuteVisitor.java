package codeGen.codeFunctions;

import ast.Program;
import ast.program.definitions.FuncDefinition;
import ast.program.statements.Assignment;
import ast.program.statements.Read;
import ast.program.statements.Write;

public class ExecuteVisitor extends AbstractCGVisitor<Void, Void>{
	
	@Override
	public Void visit(Read readStmnt, Void param) {
		cg.println("'*Read stmnt");
		//address
		readStmnt.accept(this, param);
		cg.print("in");
		cg.println(readStmnt.exp.getType().getSuffix());
		cg.print("store");
		cg.println(readStmnt.exp.getType().getSuffix());
		return null;
	}
	
	@Override
	public Void visit(Write writeStmnt, Void param) {
		cg.println("'*Write stmnt");
		//push implicit
		//this deberia ser el otro visitor??
		writeStmnt.accept(this, param);
		cg.print("out");
		cg.println(writeStmnt.expression.getType().getSuffix());
		return null;
	}
	
	@Override
	public Void visit(Program program, Void param) {
		cg.invocationToMain();
		cg.println("' Global variables");
		program.definitions.stream()
			.filter(def -> def instanceof FuncDefinition)
			//execute funcdef
			.map(def -> def.accept(this, param));
		return null;
		
	}
	
	@Override
	public Void visit(Assignment assign, Void param) {
		cg.println("' Global variables");
		
		return null;
	}
}
