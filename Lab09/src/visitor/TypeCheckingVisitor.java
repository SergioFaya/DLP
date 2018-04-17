package visitor;

import java.util.ArrayList;
import java.util.List;

import ast.program.Expression;
import ast.program.Type;
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
import ast.program.expressions.unary.UnaryMinus;
import ast.program.expressions.unary.UnaryNegation;
import ast.program.expstmnt.FunctionInvocation;
import ast.program.statements.Assignment;
import ast.program.statements.IfStmnt;
import ast.program.statements.Read;
import ast.program.statements.WhileStmnt;
import ast.program.types.ErrorType;
import ast.program.types.primitive.CharType;
import ast.program.types.primitive.IntType;
import ast.program.types.primitive.RealType;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

	@Override
	public Void visit(CharLiteral charlit, Void param) {
		charlit.setType(CharType.getInstance());
		return null;
	}

	@Override
	public Void visit(IntLiteral intLit, Void param) {
		intLit.setType(IntType.getInstance());
		return null;
	}

	@Override
	public Void visit(RealLiteral realLit, Void param) {
		realLit.setType(RealType.getInstance());
		return null;
	}

	@Override
	public Void visit(Variable var, Void param) {
		var.setLvalue(true);
		return null;
	}

	@Override
	public Void visit(Cast cast, Void param) {
		cast.exp.accept(this, param);
		cast.castType.accept(this, param);
		Type t = cast.setType(cast.getType().cast(cast.exp.getType()));
		if (t == null) {
			new ErrorType(cast.getLine(), cast.getColumn(), "Unnable to perform the cast");
		}
		return null;
	}

	@Override
	public Void visit(Arithmetic arithmetic, Void param) {
		arithmetic.exprLeft.accept(this, param);
		arithmetic.exprRight.accept(this, param);
		Type t = arithmetic.setType(arithmetic.exprLeft.getType().arithmetic(arithmetic.exprRight.getType()));
		if (t == null) {
			arithmetic.setType(new ErrorType(arithmetic.getLine(), arithmetic.getColumn(),
					"Error in arithmetic expression: expression differ in types"));
		}
		return null;
	}

	@Override
	public Void visit(Comparison comp, Void param) {
		comp.exprLeft.accept(this, param);
		comp.exprRight.accept(this, param);
		Type t = comp.setType(comp.exprLeft.getType().comparison(comp.exprRight.getType()));
		if (t == null) {
			comp.setType(new ErrorType(comp.getLine(), comp.getColumn(), "Error in comparison expression"));
		}
		return null;
	}

	@Override
	public Void visit(Logical logic, Void param) {
		logic.exprLeft.accept(this, param);
		logic.exprRight.accept(this, param);
		Type t = logic.setType(logic.exprLeft.getType().logical(logic.exprRight.getType()));
		if (t == null) {
			logic.setType(new ErrorType(logic.getLine(), logic.getColumn(), "Error in comparison expression"));
		}
		return null;
	}

	@Override
	public Void visit(FieldAccessExpr fieldExpr, Void param) {
		fieldExpr.exprLeft.accept(this, param);
		if (fieldExpr.exprLeft.getType() != null) {
			Type t = fieldExpr.setType(fieldExpr.exprLeft.getType().dot(fieldExpr.field));
			if (t == null) {
				new ErrorType(fieldExpr.getLine(), fieldExpr.getColumn(), "Cannot get access to that field");
			}
		}
		if (fieldExpr.exprLeft.getLvalue()) {
			fieldExpr.setLvalue(true);
		}
		return null;
	}

	@Override
	public Void visit(Assignment assignment, Void param) {
		assignment.expLeft.accept(this, param);
		assignment.expRight.accept(this, param);
		if (!assignment.expLeft.getLvalue())
			new ErrorType(assignment.expLeft.getLine(), assignment.expLeft.getColumn(), "LValue expected");

		if (assignment.expLeft.getType() != null && assignment.expRight.getType() != null) {
			assignment.expLeft.setType(assignment.expRight.getType().promotesTo(assignment.expLeft.getType()));
			if (assignment.expLeft.getType() == null) {
				new ErrorType(assignment.expLeft.getLine(), assignment.expLeft.getColumn(), "Type missmatching error");
			}
		}
		return null;
	}

	@Override
	public Void visit(Indexing indexing, Void param) {
		indexing.exprLeft.accept(this, param);
		indexing.expBrackets.accept(this, param);
		if (!indexing.expBrackets.getLvalue()) {
			new ErrorType(indexing.getLine(), indexing.getColumn(), "Lvalue expected");
		} else {
			indexing.setLvalue(true);
		}

		Type t = indexing.setType(indexing.expBrackets.getType().squareBrackets(indexing.exprLeft.getType()));
		if (t == null) {
			new ErrorType(indexing.getLine(), indexing.getColumn(), "Index not valid");
		}
		return null;
	}

	@Override
	public Void visit(Read read, Void param) {
		read.exp.accept(this, param);
		if (!read.exp.getLvalue())
			new ErrorType(read.exp.getLine(), read.exp.getColumn(), "Lvalue expected");
		return null;
	}

	@Override
	public Void visit(FunctionInvocation func, Void param) {
		func.variable.accept(this, param);
		List<Type> types = new ArrayList<Type>();
		if (func.params != null) {
			for (Expression e : func.params) {
				e.accept(this, param);
				types.add(e.getType());
			}
		}
		Type t = func.setType(func.variable.getType().parenthesis(types));
		if (t == null) {
			new ErrorType(func.getLine(), func.getColumn(), "Cannot invoke the function");
		}
		return null;
	}

	@Override
	public Void visit(UnaryNegation unegation, Void param) {
		unegation.exp.accept(this, param);
		Type t = unegation.setType(unegation.exp.getType().logical());
		if (t == null) {
			new ErrorType(unegation.getLine(), unegation.getColumn(), "Expected integer type or valid promotion");
		}
		return null;
	}

	@Override
	public Void visit(UnaryMinus uminus, Void param) {
		uminus.expression.accept(this, param);
		Type t = uminus.setType(uminus.expression.getType().arithmetic());
		if (t == null) {
			new ErrorType(uminus.getLine(), uminus.getColumn(), "Expected integer type or valid promotion");
		}
		return null;
	}
	
	@Override
	public Void visit(WhileStmnt whileStmnt, Void param) {
		whileStmnt.exp.accept(this, param);
		whileStmnt.stmnts.forEach(s -> s.accept(this, param));
		if (whileStmnt.exp.getType() != null) {
			if(!whileStmnt.exp.getType().isLogical()) {
				new ErrorType(whileStmnt.getLine(),whileStmnt.getColumn(),"Not valid logical expression");
			}
		}
		return null;
	}
	
	@Override
	public Void visit(IfStmnt ifStmnt, Void param) {
		ifStmnt.exp.accept(this, param);
		ifStmnt.elseStmnts.forEach(st-> st.accept(this, param));
		ifStmnt.ifStmnts.forEach(st-> st.accept(this, param));
		if(!ifStmnt.exp.getType().isLogical()) {
			new ErrorType(ifStmnt.getLine(), ifStmnt.getColumn(), "Not valid logical expression");
		}
		return null;
	}
}
