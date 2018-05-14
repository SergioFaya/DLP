package codeGen.codeFunctions;

public class CodeFunctions {
	
	private static ValueVisitor value = new ValueVisitor();
	private static AddressVisitor address = new AddressVisitor();
	private static ExecuteVisitor execute = new ExecuteVisitor();
		
	private CodeFunctions() {
		
	}
	
	public static ValueVisitor getValue() {
		return value;
	}
	
	public static AddressVisitor getAddress() {
		return address;
	}
	
	public static ExecuteVisitor getExecute() {
		return execute;
	}
}
