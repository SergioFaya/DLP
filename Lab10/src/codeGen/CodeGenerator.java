package codeGen;

import java.io.PrintStream;

import codeGen.codeFunctions.AddressVisitor;
import codeGen.codeFunctions.ExecuteVisitor;
import codeGen.codeFunctions.ValueVisitor;

/**
 * 
 * @author Sergio Facade for output
 */
public class CodeGenerator {

	private PrintStream out;
	private int labels;

	// Find another place for it
	public AddressVisitor address = new AddressVisitor();
	public ExecuteVisitor execute = new ExecuteVisitor();
	public ValueVisitor value = new ValueVisitor();

	public CodeGenerator() {
		this.out = System.out;
		this.labels = 1;
	}

	public CodeGenerator(PrintStream out) {
		this();
		this.out = out;
	}

	public int getLabels(int howMany) {
		int temp = this.labels;
		this.labels += howMany;
		return temp;
	}

	public void push(String suffix, int i) {
		print("push");
		print(suffix);
		print(" ");
		println(i);
	}

	public void pushBp() {
		println("pusha bp");
	}

	public void load(String suffix) {
		print("load");
	}

	public void store(String suffix) {
		println("store");
	}

	public void pop(String suffix) {
		print("pop");
		println(suffix);
	}

	public void dup(String suffix) {
		print("dup");
		println(suffix);
	}

	//Arithmetic operations
	public void add(String suffix) {
		print("add");
		println(suffix);
	}

	public void sub(String suffix) {
		print("sub");
		println(suffix);
	}
	
	public void mul(String suffix) {
		println("mul");
		println(suffix);
	}
	
	public void div(String suffix) {
		println("div");
		println(suffix);
	}
	
	public void mod(String suffix) {
		print("mod");
		println(suffix);
	}
	
	//Comparison operations
	public void gt(String suffix) {
		print("gt");
		println(suffix);
	}
	
	public void lt(String suffix) {
		print("lt");
		println(suffix);
	}
	
	public void ge(String suffix) {
		print("ge");
		println(suffix);
	}
	
	public void le(String suffix) {
		print("le");
		println(suffix);
	}
	
	public void eq(String suffix) {
		print("eq");
		println(suffix);
	}
	
	public void ne(String suffix) {
		print("ne");
		println(suffix);
	}
	
	//Logical operations 
	public void and() {
		println("and");
	}
	
	public void or() {
		println("or");
	}
	
	public void not() {
		println("not");
	}
	
	// input output
	public void out(String suffix) {
		print("out");
		println(suffix);
	}
	
	public void in(String suffix) {
		print("in");
		println(suffix);
	}
	
	// Conversions
	public void b2i() {
		println("b2i");
	}
	
	public void i2f() {
		println("i2f");
	}
	
	public void f2i() {
		println("f2i");
	}
	
	public void i2b() {
		println("i2b");
	}
	
	//Jumps 
	public void label(int label) {
		print(label);
		println(":");
	}
	
	public void jmp(int label) {
		print("jmp ");
		println(label);
	}
	
	public void jz(int label) {
		print("jz ");
		println(label);
	}
	
	public void jnz(String label) {
		print("jnz ");
		println(label);
	}
	
	//Functions
	public void call(String id) {
		print("call ");
		print(id);
	}
	
	public void enter(int cons) {
		print("enter ");
		print(cons);
	}
	
	public void ret(int returnValue, int localVariableBytes, int parametersBytes) {
		print("ret ");
		print(returnValue);
		print(",");
		print(localVariableBytes);
		print(",");
		print(parametersBytes);
	}
	
	public void halt() {
		println("halt");
	}
	
	public void invocationToMain() {
		println("'*Main invocation");
		println("call main");
		println("halt");
	}
	
	//Loging of the mapl code
	
	
	public void log(String message) {
		out.print("'*");
		out.println(message);
	}
	// General purpose printing
	public void println(String string) {
		out.println(string);
	}

	public void println() {
		out.println();
	}

	public void println(int integer) {
		out.println(integer);
	}

	public void print(String string) {
		out.print(string);
	}

	public void print(int integer) {
		out.print(integer);
	}

}
