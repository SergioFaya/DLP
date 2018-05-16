package codeGen.codeFunctions;

import ast.program.definitions.FuncDefinition;
import ast.program.expressions.FieldAccessExpr;
import ast.program.expressions.Indexing;
import ast.program.expressions.Variable;
import ast.program.expressions.literal.CharLiteral;
import ast.program.expressions.literal.IntLiteral;
import ast.program.expressions.literal.RealLiteral;
import ast.program.expressions.operands.Arithmetic;
import ast.program.expressions.operands.Comparison;
import ast.program.expressions.operands.Logical;
import ast.program.expressions.unary.Cast;
import ast.program.expressions.unary.UnaryIncrementDecrement;
import ast.program.expressions.unary.UnaryMinus;
import ast.program.expressions.unary.UnaryNegation;
import ast.program.expstmnt.FunctionInvocation;
import codeGen.CodeGenerator;
import visitor.AbstractCGVisitor;

public class ValueVisitor extends AbstractCGVisitor<FuncDefinition, Void> {

	public ValueVisitor(CodeGenerator cg) {
		super(cg);
	}

	@Override
	public Void visit(Cast cast, FuncDefinition param) {
		cg.log("Value  of Cast");
		cast.exp.accept(CodeFunctions.getValue(), param);
		cg.convertTo(cast.exp.getType(), cast.getType());
		return null;
	}

	@Override
	public Void visit(CharLiteral charlit, FuncDefinition param) {
		cg.log("Value  of char literal");
		cg.push(charlit.getType().getSuffix(), (int) charlit.value);
		return null;
	}

	@Override
	public Void visit(IntLiteral intLit, FuncDefinition param) {
		cg.log("Value  of int literal");
		cg.push(intLit.getType().getSuffix(), intLit.value);
		return null;
	}

	@Override
	public Void visit(RealLiteral realLit, FuncDefinition param) {
		cg.log("Value  of real literal");
		cg.push(realLit.getType().getSuffix(), realLit.value);
		return null;
	}

	@Override
	public Void visit(Variable var, FuncDefinition param) {
		cg.log("Value of variable");
		var.accept(CodeFunctions.getAddress(), param);
		cg.load(var.getDefinition().getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(Arithmetic arith, FuncDefinition param) {
		cg.log("Value of arithmetic");
		arith.exprLeft.accept(CodeFunctions.getValue(), param);
		cg.convertTo(arith.exprLeft.getType(), arith.getType());
		arith.exprRight.accept(CodeFunctions.getValue(), param);
		cg.convertTo(arith.exprRight.getType(), arith.getType());
		cg.arithmetic(arith);
		return null;
	}

	@Override
	public Void visit(Comparison comp, FuncDefinition param) {
		cg.log("Value  of comparison");
		comp.exprLeft.accept(this, param);
		comp.exprRight.accept(this, param);
		cg.comparator(comp);
		return null;
	}

	@Override
	public Void visit(Logical logic, FuncDefinition param) {
		cg.log("Value  of logical");
		logic.exprLeft.accept(this, param);
		logic.exprRight.accept(this, param);
		cg.logical(logic);
		return null;
	}

	@Override
	public Void visit(Indexing indexing, FuncDefinition param) {
		cg.log("Value  of indexing");
		indexing.accept(CodeFunctions.getAddress(), param);
		cg.load(indexing.getType().getSuffix());
		return null;
	}

	@Override

	public Void visit(FieldAccessExpr fieldExpr, FuncDefinition param) {
		cg.log("Value  of field Access Expression");
		fieldExpr.accept(CodeFunctions.getAddress(), param);
		cg.load(fieldExpr.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(UnaryMinus uminus, FuncDefinition param) {
		cg.log("Value  of uminus");
		uminus.expression.accept(this, param);
		cg.push(uminus.expression.getType().getSuffix(), -1);
		cg.mul(uminus.expression.getType().getSuffix());
		return null;
	}

	@Override
	public Void visit(UnaryNegation unegation, FuncDefinition param) {
		cg.log("Value  of unary negation");
		unegation.exp.accept(this, param);
		cg.not();
		return null;
	}

	@Override
	public Void visit(FunctionInvocation funcInvoke, FuncDefinition param) {
		cg.log("Value  of function invocation expr");
		funcInvoke.params.forEach(p -> p.accept(CodeFunctions.getValue(), param));
		cg.call(funcInvoke.variable.getDefinition().getName());
		return null;
	}

	@Override
	public Void visit(UnaryIncrementDecrement unaryID, FuncDefinition param) {
		unaryID.variable.accept(CodeFunctions.getAddress(), param);
		unaryID.variable.accept(this, param);
		if (unaryID.operator.equals("++")) {
			cg.push(unaryID.getType().getSuffix(), 1);
			cg.add(unaryID.getType().getSuffix());
			cg.store(unaryID.getType().getSuffix());
			unaryID.variable.accept(this, param);
		} else if (unaryID.operator.equals("--")) {
			cg.push(unaryID.getType().getSuffix(), -1);
			cg.add(unaryID.getType().getSuffix());
			cg.store(unaryID.getType().getSuffix());
			unaryID.variable.accept(this, param);
		}
		return null;
	}
}