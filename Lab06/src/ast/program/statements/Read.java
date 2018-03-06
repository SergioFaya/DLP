package ast.program.statements;



import ast.AbstractASTNode;
import ast.program.Expression;
import ast.program.Statement;
import visitor.Visitor;

public class Read extends AbstractASTNode implements Statement {

	public Expression expression;
	
	public Read(int line, int column, Expression expression) {
		super(line,column);
		this.expression = expression;
	}

	@Override
	public String toString() {
		return "Read [expression=" + expression + ", line=" + line + ", column=" + column + "]";
	}	

	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

}
