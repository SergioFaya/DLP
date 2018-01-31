package program.statements;



import ast.AbstractASTNode;
import program.Expression;
import program.Statement;

public class Read extends AbstractASTNode implements Statement {

	public Expression expression;
	
	public Read(int line, int column, Expression expression) {
		this.line = line;
		this.column = column;
		this.expression = expression;
	}

	@Override
	public String toString() {
		return "Read [expression=" + expression + "]";
	}	

	
	

}
