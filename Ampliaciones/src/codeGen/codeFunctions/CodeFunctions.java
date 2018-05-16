package codeGen.codeFunctions;

import java.io.PrintStream;

import codeGen.CodeGenerator;

public class CodeFunctions {
	
	private static ValueVisitor value;
	private static AddressVisitor address;
	private static ExecuteVisitor execute;
	private static String filename;
	
	public static ValueVisitor getValue() {
		return value;
	}
	
	public static AddressVisitor getAddress() {
		return address;
	}
	
	public static ExecuteVisitor getExecute() {
		return execute;
	}

	public static void setPrintStream(PrintStream out) {
		CodeGenerator  cg = new CodeGenerator(out,filename);
		value = new ValueVisitor(cg);
		address = new AddressVisitor(cg);
		execute = new ExecuteVisitor(cg);	
		
	}

	public static void setFileName(String file) {
		filename = file;
	}
}
