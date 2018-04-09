package visitor;

import ast.program.definitions.FuncDefinition;
import ast.program.definitions.VarDefinition;
import ast.program.expressions.Variable;
import ast.program.expstmnt.FunctionInvocation;
import ast.program.statements.Read;
import ast.program.statements.Write;
import ast.program.types.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

	@Override
	public Void visit(VarDefinition varDef, Void param) {
		varDef.type.accept(this, param);
		SymbolTable symbolTable = SymbolTable.getInstance();
		if (symbolTable.findInCurrentScope(varDef.name) != null) {
			new ErrorType(varDef.getLine(), varDef.getColumn(),
					"Definition with name " + varDef.name + " already exists");
		} else {
			symbolTable.insert(varDef);
		}
		return null;
	}

	@Override
	public Void visit(FuncDefinition funcDef, Void param) {
		SymbolTable symbolTable = SymbolTable.getInstance();
		if (symbolTable.find(funcDef.name) != null) {
			new ErrorType(funcDef.getLine(), funcDef.getColumn(),
					"Definition with name " + funcDef.name + " already exists");
		} else {
			symbolTable.insert(funcDef);
		}
		symbolTable.set();
		funcDef.type.accept(this, param);
		funcDef.body.forEach(st -> st.accept(this, param));
		symbolTable.reset();
		return null;
	}

	@Override
	public Void visit(FunctionInvocation funct, Void param) {
		funct.variable.accept(this, param);
		funct.params.forEach(p -> p.accept(this, param));
		SymbolTable symbolTable = SymbolTable.getInstance();
		if (symbolTable.find(funct.variable.name) == null) {
			new ErrorType(funct.getLine(), funct.getColumn(),
					"Function " + funct.variable.name + " is not defined in scope");
		}
		return null;
	}

	@Override
	public Void visit(Read readStmnt, Void param) {
		readStmnt.exp.accept(this, param);
		if (readStmnt.exp instanceof Variable) {
			SymbolTable symbolTable = SymbolTable.getInstance();
			if (symbolTable.find(((Variable) readStmnt.exp).name) == null) {
				new ErrorType(readStmnt.getLine(), readStmnt.getColumn(),
						"Variable " + ((Variable) readStmnt.exp).name + " is not defined in scope");
			}
		}
		return null;
	}

	@Override
	public Void visit(Write writeStmnt, Void param) {
		writeStmnt.expression.accept(this, param);
		if (writeStmnt.expression instanceof Variable) {
			SymbolTable symbolTable = SymbolTable.getInstance();
			if (symbolTable.find(((Variable) writeStmnt.expression).name) == null) {
				new ErrorType(writeStmnt.getLine(), writeStmnt.getColumn(),
						"Variable " + ((Variable) writeStmnt.expression).name + " is not defined in scope");
			}
		}
		return null;
	}

}
