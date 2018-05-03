package codeGen;

import java.io.PrintStream;

import ast.program.Type;
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

	//Find another place for it
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

	public void push(int i) {
		out.print("pushi ");
		out.println(i);
	}

	public void push(char c) {
		int i = (int)c;
		out.print("pushb ");
		out.println(i);
	}

	public void push(float f) {
		out.print("pushf ");
		out.println(f);
	}
	
	public void pusha(int a) {
		out.print("pusha ");
		out.println(a);
	}
	
	public void pushBp() {
		out.println("pusha bp");
	}
	
	public void load() {
		out.println("load");
	}
	
	public void loadi() {
		out.println("loadi");
	}
	
	public void loadb() {
		out.println("loadb");
	}
	
	public void loadf() {
		out.println("loadf");
	}
	
	public void arith(String op, Type t) {
		
	}

	public void store(Type t) {

	}

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

	public void invocationToMain() {
		println("'*Main invocation");
		println("call main");
		println("halt");
	}

	public void enter(int totalLocalBytes) {
		out.println("enter " + totalLocalBytes);

	}

	public void ret(int returnValue, int localVariableBytes, int parametersBytes) {
		out.print("ret ");
		out.print(returnValue);
		out.print(",");
		out.print(localVariableBytes);
		out.print(",");
		out.print(parametersBytes);
	}
}
