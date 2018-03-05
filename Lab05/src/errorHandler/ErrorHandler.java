package errorHandler;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import ast.program.types.ErrorType;

public class ErrorHandler {

	private static ErrorHandler instance = new ErrorHandler();
	private List<ErrorType> errors = new ArrayList<>();
	
	public static ErrorHandler getInstance() {
		return instance;
	}
	
	private ErrorHandler() {
	}
	
	public boolean anyError() {
		return errors.size() != 0;
	}
	
	public void showError(PrintStream stream) {
		errors.forEach(a -> stream.println(a.toString()));
	}
	
	public void addError(ErrorType error) {
		errors.add(error);
	}
}
