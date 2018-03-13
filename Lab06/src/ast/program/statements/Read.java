package ast.program.statements;



import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Statement;
import visitor.Visitor;

public class Read extends AbstractASTNode implements Statement {

	public Expression exp;
	
	public Read(int line, int column, Expression expression) {
		super(line,column);
		this.exp = expression;
	}

	@Override
	public String toString() {
		return "Read [expression=" + exp + ", line=" + line + ", column=" + column + "]";
	}	

	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

}
