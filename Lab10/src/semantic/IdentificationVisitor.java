package semantic;

import ast.program.definitions.FuncDefinition;
import ast.program.definitions.VarDefinition;
import ast.program.expressions.Variable;
import ast.program.expstmnt.FunctionInvocation;
import ast.program.types.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

	private SymbolTable symbolTable = new SymbolTable();
	
	public IdentificationVisitor() {
	}
	
	@Override
	public Void visit(VarDefinition varDef, Void param) {
		varDef.getType().accept(this, param);
		if (symbolTable.findInCurrentScope(varDef.getName()) != null) {
			new ErrorType(varDef.getLine(), varDef.getColumn(),
					"Definition with name " + varDef.getName() + " already exists");
		} else {
			symbolTable.insert(varDef);
		}
		return null;
	}

	@Override
	public Void visit(FuncDefinition funcDef, Void param) {
		if (symbolTable.find(funcDef.getName()) != null) {
			new ErrorType(funcDef.getLine(), funcDef.getColumn(),
					"Definition with name " + funcDef.getName() + " already exists");
		} else {
			symbolTable.insert(funcDef);
		}
		symbolTable.set();
		funcDef.getType().accept(this, param);
		funcDef.body.forEach(st -> st.accept(this, param));
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
		VarDefinition def = (VarDefinition) symbolTable.find(variable.name);
		if(def == null) {
			new ErrorType(variable.getLine(), variable.getColumn(), "Variable "+variable.name+" is not defined in scope");
		}else {
			//set type or set definition
			variable.setDefinition(def);
		}
		return null;
	}

}
