package visitor;

import ast.program.Type;
import ast.program.expressions.Indexing;
import ast.program.expressions.Variable;
import ast.program.expressions.operands.Arithmetic;
import ast.program.statements.Assignment;
import ast.program.statements.Read;
import ast.program.types.ErrorType;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

	@Override
	public Void visit(Variable var, Void param) {
		var.setLvalue(true);
		return null;
	}

	@Override
	public Void visit(Arithmetic arithmetic, Void param) {
		arithmetic.exprLeft.accept(this, param);
		arithmetic.exprRight.accept(this, param);
		arithmetic.setLvalue(false);
		Type t = arithmetic.setType(arithmetic.exprLeft.getType().arithmetic(arithmetic.exprRight.getType()));
		if(t == null) {
			arithmetic.setType(new ErrorType(arithmetic.getLine(), arithmetic.getColumn(), "Error in arithmetic expression"));
		}
		
		return null;
	}

	@Override
	public Void visit(Assignment assignment, Void param) {
		assignment.expLeft.accept(this, param);
		assignment.expRight.accept(this, param);
		if (!assignment.expLeft.getLvalue())
			new ErrorType(assignment.expLeft.getLine(), assignment.expLeft.getColumn(), "LValue not found");
		return null;
	}

	@Override
	public Void visit(Indexing indexing, Void param) {
		indexing.exprLeft.accept(this, param);
		indexing.expBrackets.accept(this, param);
		indexing.setLvalue(true);
		return null;
	}

	@Override
	public Void visit(Read read, Void param) {
		read.exp.accept(this, param);
		if (!read.exp.getLvalue())
			new ErrorType(read.exp.getLine(), read.exp.getColumn(), "LValue not found");
		return null;
	}

}
