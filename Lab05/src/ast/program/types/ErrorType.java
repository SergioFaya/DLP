package ast.program.types;

import ast.AbstractASTNode;
import ast.program.Type;
import errorHandler.ErrorHandler;

public class ErrorType extends AbstractASTNode implements Type{
	
	private String msg;

	public ErrorType(int line,int column, String msg) {
		super(line, column);
		this.msg = msg;
		ErrorHandler.getInstance().addError(this);
	}
	
	@Override
	public String toString() {
		return "ErrorType [msg=" + msg + ", line=" + line + ", column=" + column + "]";
	}
	
	

}
