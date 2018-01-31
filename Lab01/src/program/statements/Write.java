package program.statements;



import ast.AbstractASTNode;
import program.Expression;
import program.Statement;

public class Write extends AbstractASTNode implements Statement  {

	public Expression expression;

	public Write(int line, int column, Expression expression) {
		this.line = line;
		this.column = column;
		this.expression = expression;
	}

	@Override
	public String toString() {
		return "Write [expression=" + expression + "]";
	}

	
}
