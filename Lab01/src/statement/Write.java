package statement;



import ast.AbstractASTNode;
import expressions.Expression;

public class Write extends AbstractASTNode implements Statement  {

	public Expression expression;

	public Write(int line, int column, Expression expression) {
		this.line = line;
		this.column = column;
		this.expression = expression;
	}

}
