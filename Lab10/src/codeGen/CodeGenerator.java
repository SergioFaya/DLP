package codeGen;

import java.io.PrintStream;

import ast.program.Type;

/**
 * 
 * @author Sergio
 * Facade for output
 */
public class CodeGenerator {
	
	private PrintStream out;
	
	public CodeGenerator() {
		out = System.out;
	}
	
	public CodeGenerator(PrintStream out) {
		this.out = out;
	}
	
	public void push(int i) {

	}
	
	public void push(char c) {
	
	}
	
	public void arith(String op, Type t) {
		
	}
	
	public void store(Type t) {
		
	}
	
	public void load() {
		
	}
	
	public void println(String string) {
		out.println(string);
	}
	
	public void print(String string) {
		out.print(string);
	}

	public void invocationToMain() {
		println("'*Main invocation");
		println("call main");
		println("halt");
	}
}
