package ast.program.types;

import errorHandler.ErrorHandler;
import visitor.Visitor;

public class ErrorType extends AbstractType{
	
	private String msg;
	private int offset; 
	
	public ErrorType(int line,int column, String msg) {
		super(line, column);
		this.msg = msg;
		ErrorHandler.getInstance().addError(this);
	}
	
	@Override
	public String toString() {
		return "ErrorType [msg=" + msg + ", offset=" + offset + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

}
