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
		cg.log("Address Variable");
		if(var.getDefinition().getScope() >= 1) {
			cg.pushBp();
			cg.push("i", var.getDefinition().getOffset());
			cg.add("i");
		}else {
			cg.push("a", var.getDefinition().getOffset());
		}
		cg.log("end adres variable");
		return null;
	}
	
	@Override
	public Void visit(Indexing indexing, FuncDefinition param) {
		cg.log("Address Indexing");
		indexing.exprLeft.accept(CodeFunctions.getAddress(), param);
		indexing.expBrackets.accept(CodeFunctions.getValue(), param);
		cg.push("i",indexing.getType().getNumberOfBytes());
		cg.mul("i");
		cg.add("i");
		return null;
	}
	
	@Override
	public Void visit(FieldAccessExpr fieldExpr, FuncDefinition param) {
		cg.log("Address Field Accessing");
		fieldExpr.exprLeft.accept(CodeFunctions.getAddress(), param);
		return null;
	}
}