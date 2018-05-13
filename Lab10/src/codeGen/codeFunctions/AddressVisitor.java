package codeGen.codeFunctions;

import ast.program.definitions.FuncDefinition;
import ast.program.expressions.FieldAccessExpr;
import ast.program.expressions.Indexing;
import ast.program.expressions.Variable;
import visitor.AbstractCGVisitor;

public class AddressVisitor extends AbstractCGVisitor<FuncDefinition, Void>{

	private CodeFunctions cfs = CodeFunctions.getInstance();
	
	@Override
	public Void visit(Variable var, FuncDefinition param) {
		cg.log("Expression Variable");
		if(var.getDefinition().getScope() >= 1) {
			cg.pushBp();
			//bytes local sum??
			cg.push("i", var.getDefinition().getOffset());
			cg.add(var.getDefinition().getType().getSuffix());
		}else {
			//bytes local sum??
			cg.push("a", var.getDefinition().getOffset());
		}
		return null;
	}
	
	@Override
	public Void visit(Indexing indexing, FuncDefinition param) {
		cg.log("Expression Indexing");
		indexing.exprLeft.accept(cfs.getAddress(), param);
		indexing.expBrackets.accept(cfs.getAddress(), param);
		cg.push(indexing.getType().getSuffix(),indexing.getType().getNumberOfBytes());
		cg.mul(indexing.getType().getSuffix());
		cg.add(indexing.getType().getSuffix());
		return null;
	}
	
	@Override
	public Void visit(FieldAccessExpr fieldExpr, FuncDefinition param) {
		cg.log("Expression Field Accesing");
		fieldExpr.exprLeft.accept(cfs.getAddress(), param);
		return null;
	}
}