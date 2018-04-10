package visitor;

import ast.program.Definition;
import ast.program.definitions.FuncDefinition;
import ast.program.definitions.VarDefinition;
import ast.program.expressions.Variable;
import ast.program.expstmnt.FunctionInvocation;
import ast.program.types.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

	private SymbolTable symbolTable = new SymbolTable();
	
	@Override
	public Void visit(VarDefinition varDef, Void param) {
		varDef.getType().accept(this, param);
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
		if (symbolTable.find(funcDef.name) != null) {
			new ErrorType(funcDef.getLine(), funcDef.getColumn(),
					"Definition with name " + funcDef.name + " already exists");
		} else {
			symbolTable.insert(funcDef);
		}
		symbolTable.set();
		funcDef.getType().accept(this, param);
		funcDef.stmntsº	.forEach(st -> st.accept(this, param));
		symbolTable.reset();
		return null;
	}

	@Override
	public Void visit(FunctionInvocation funct, Void param) {
		funct.variable.accept(this, param);
		funct.params.forEach(p -> p.accept(this, param));
		if (symbolTable.find(funct.variable.name) == null) {
			new ErrorType(funct.getLine(), funct.getColumn(),
					"Function " + funct.variable.name + " is not defined in scope");
		}
		return null;
	}
	
	@Override
	public Void visit(Variable variable, Void param) {
		Definition def = symbolTable.find(variable.name);
		if(symbolTable.find(variable.name) == null) {
			new ErrorType(variable.getLine(), variable.getColumn(), "Variable is not defined in scope");
		}else {
			variable.setDefinition(def);
		}
		return null;
	}

}
