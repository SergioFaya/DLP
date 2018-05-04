package codeGen.codeFunctions;

public class CodeFunctions {
	
	private ValueVisitor value = new ValueVisitor();
	private AddressVisitor address = new AddressVisitor();
	private ExecuteVisitor execute = new ExecuteVisitor();
	
	private static CodeFunctions instance = new CodeFunctions();
	
	private CodeFunctions() {
	}
	
	public ValueVisitor getValue() {
		return value;
	}
	
	public AddressVisitor getAddress() {
		return address;
	}
	
	public ExecuteVisitor getExecute() {
		return execute;
	}

	public static CodeFunctions getInstance() {
		return instance;
	}
}
