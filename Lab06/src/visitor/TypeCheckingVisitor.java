package visitor;

import ast.program.expressions.FieldAccessExpr;
import ast.program.expressions.IndexAccessExpr;
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
import ast.program.statements.Assignment;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void>{

	@Override
	public Void visit(CharLiteral charlit, Void param) {
		charlit.setLvalue(false);
		return null;
	}
	
	@Override
	public Void visit(IntLiteral intLit, Void param) {
		intLit.setLvalue(false);
		return null;
	}
	
	@Override
	public Void visit(RealLiteral realLit, Void param) {
		realLit.setLvalue(false);
		return null;
	}
	
	@Override
	public Void visit(Arithmetic arith, Void param) {
		arith.setLvalue(false);
		return null;
	}
	
	@Override
	public Void visit(Comparison comp, Void param) {
		comp.setLvalue(false);
		return null;
	}
	
	@Override
	public Void visit(Logical logic, Void param) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Void visit(Cast cast, Void param) {
		cast.setLvalue(false);
		return null;
	}
	
	@Override
	public Void visit(UnaryMinus uminus, Void param) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Void visit(UnaryNegation unegation, Void param) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Void visit(FieldAccessExpr fieldExpr, Void param) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Void visit(IndexAccessExpr indexing, Void param) {
		
		return null;
	}
	
	@Override
	public Void visit(Variable var, Void param) {
		var.setLvalue(false);
		return null;
	}
	
}
