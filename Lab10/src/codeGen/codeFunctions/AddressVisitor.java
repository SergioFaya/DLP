package codeGen.codeFunctions;

import ast.program.definitions.FuncDefinition;
import ast.program.expressions.FieldAccessExpr;
import ast.program.expressions.Indexing;
import ast.program.expressions.Variable;
import codeGen.CodeGenerator;
import visitor.AbstractCGVisitor;

public class AddressVisitor extends AbstractCGVisitor<FuncDefinition, Void>{

	
	public AddressVisitor(CodeGenerator cg) {
		super(cg);
	}

	@Override
	public Void visit(Variable var, FuncDefinition param) {
		cg.log("Expression Variable");
		if(var.getDefinition().getScope() >= 1) {
			cg.pushBp();
			cg.push("i", var.getDefinition().getOffset());
			cg.add("i");
		}else {
			cg.push("a", var.getDefinition().getOffset());
		}
		return null;
	}
	
	@Override
	public Void visit(Indexing indexing, FuncDefinition param) {
		cg.log("Expression Indexing");
		indexing.exprLeft.accept(CodeFunctions.getAddress(), param);
		indexing.expBrackets.accept(CodeFunctions.getAddress(), param);
		cg.push(indexing.getType().getSuffix(),indexing.getType().getNumberOfBytes());
		cg.mul(indexing.getType().getSuffix());
		cg.add(indexing.getType().getSuffix());
		return null;
	}
	
	@Override
	public Void visit(FieldAccessExpr fieldExpr, FuncDefinition param) {
		cg.log("Expression Field Accesing");
		fieldExpr.exprLeft.accept(CodeFunctions.getAddress(), param);
		return null;
	}
}