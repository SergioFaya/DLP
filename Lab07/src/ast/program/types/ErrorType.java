package ast.program.types;

import ast.AbstractASTNode;
import ast.program.Type;
import errorHandler.ErrorHandler;
import visitor.Visitor;

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
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

	@Override
	public Type getType() {
		return null;
	}

}
