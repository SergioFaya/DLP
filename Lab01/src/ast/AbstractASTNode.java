package ast;

public class AbstractASTNode implements ASTNode{

	protected int line;
	protected int column;
	
	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

}
