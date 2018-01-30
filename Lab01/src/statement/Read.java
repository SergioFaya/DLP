package statement;



import ast.AbstractASTNode;
import expressions.Expression;

public class Read extends AbstractASTNode implements Statement {

	public Expression expression;
	
	public Read(int line, int column, Expression expression) {
		this.line = line;
		this.column = column;
		this.expression = expression;
	}	

	

}
