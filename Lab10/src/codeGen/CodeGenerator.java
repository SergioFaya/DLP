package codeGen;

import java.io.PrintStream;

import ast.program.Type;
import ast.program.expressions.operands.Arithmetic;
import ast.program.expressions.operands.Comparison;
import ast.program.expressions.operands.Logical;

/**
 * 
 * @author Sergio Facade for output
 */
public class CodeGenerator {

	private PrintStream out;
	private int labels;
	private String filename;
	
	public CodeGenerator() {
		this.out = System.out;
		this.labels = 1;
	}

	public CodeGenerator(PrintStream out, String filename)  {
		this();
		this.out = out;
		this.filename = filename;
	}
	
	public int getLabels(int howMany) {
		int temp = this.labels;
		this.labels += howMany;
		return temp;
	}

	public void push(String suffix, Number n) {
		tab();
		print("push");
		print(suffix);
		print("\t");
		println(n.toString());
	}

	public void pushBp() {
		tab();
		println("push\tbp");
	}

	public void load(String suffix) {
		tab();
		print("load");
		println(suffix);
	}

	public void store(String suffix) {
		tab();
		print("store");
		println(suffix);
	}

	public void pop(String suffix) {
		tab();
		print("pop");
		println(suffix);
	}

	public void dup(String suffix) {
		tab();
		print("dup");
		println(suffix);
	}

	// Arithmetic operations
	public void add(String suffix) {
		tab();
		print("add");
		println(suffix);
	}

	public void sub(String suffix) {
		tab();
		print("sub");
		println(suffix);
	}

	public void mul(String suffix) {
		tab();
		print("mul");
		println(suffix);
	}

	public void div(String suffix) {
		tab();
		print("div");
		println(suffix);
	}

	public void mod(String suffix) {
		tab();
		print("mod");
		println(suffix);
	}

	// Comparison operations
	public void gt(String suffix) {
		tab();
		print("gt");
		println(suffix);
	}

	public void lt(String suffix) {
		tab();
		print("lt");
		println(suffix);
	}

	public void ge(String suffix) {
		tab();
		print("ge");
		println(suffix);
	}

	public void le(String suffix) {
		tab();
		print("le");
		println(suffix);
	}

	public void eq(String suffix) {
		tab();
		print("eq");
		println(suffix);
	}

	public void ne(String suffix) {
		tab();
		print("ne");
		println(suffix);
	}

	// Logical operations
	public void and() {
		tab();
		println("and");
	}

	public void or() {
		tab();
		println("or");
	}

	public void not() {
		tab();
		println("not");
	}

	// input output
	public void out(String suffix) {
		tab();
		print("out");
		println(suffix);
	}

	public void in(String suffix) {
		tab();
		print("in");
		println(suffix);
	}

	// Conversions
	private void b2i() {
		tab();
		println("b2i");
	}

	private void i2f() {
		tab();
		println("i2f");
	}

	private void f2i() {
		tab();
		println("f2i");
	}

	private void i2b() {
		tab();
		println("i2b");
	}

	public void convertTo(Type type1, Type type2) {
		String suffix1 = type1.getSuffix();
		String suffix2 = type2.getSuffix();
		String op = suffix1 + "2" + suffix2;
		switch (op) {
		case "i2i":
			break;
		case "f2f":
			break;
		case "b2b":
			break;
		case "i2b":
			i2b();
			break;
		case "b2i":
			b2i();
			break;
		case "i2f":
			i2f();
			break;
		case "f2i":
			f2i();
			break;
		case "b2f":
			b2i();
			i2f();
			break;
		default:
			throw new IllegalArgumentException("Cannot apply conversion operation " + op);
		}
	}

	// Jumps
	public void label(int label) {
		tab();
		print(label);
		println(":");
	}
	
	public void label(String label) {
		tab();
		print(label);
		println(":");
	}

	public void jmp(int label) {
		tab();
		print("jmp ");
		println(label);
	}

	public void jz(int label) {
		tab();
		print("jz ");
		println(label);
	}

	public void jnz(String label) {
		tab();
		print("jnz ");
		println(label);
	}

	// Functions
	public void call(String id) {
		tab();
		print("call ");
		println(id);
	}

	public void enter(int cons) {
		tab();
		print("enter\t");
		println(cons);
	}

	public void ret(int returnValue, int localVariableBytes, int parametersBytes) {
		tab();
		print("ret\t");
		print(returnValue);
		print(", ");
		print(localVariableBytes);
		print(", ");
		println(parametersBytes);
	}

	public void invocationToMain() {
		println();
		println("' Invocation to the main function");
		println("call main");
		println("halt");
		println();
		println();
	}

	// Loging of the mapl code

	public void log(String message) {
		tab();
		out.print("' * ");
		out.println(message);
	}

	// General purpose printing
	public void println(String string) {
		out.println(string);
	}
	
	public void tab() {
		out.print("\t");
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

	public void comparator(Comparison comp) {
		switch (comp.operand) {
		case ">":
			gt(comp.getType().getSuffix());
			break;
		case "<":
			lt(comp.getType().getSuffix());
			break;
		case ">=":
			ge(comp.getType().getSuffix());
			break;
		case "<=":
			le(comp.getType().getSuffix());
			break;
		case "==":
			eq(comp.getType().getSuffix());
			break;
		case "!=":
			ne(comp.getType().getSuffix());
			break;
		default:
			throw new IllegalArgumentException("Invalid comparison operator " + comp.operand);
		}
	}

	public void logical(Logical logic) {
		switch (logic.operand) {
		case "&&":
			and();
			break;
		case "||":
			or();
			break;
		default:
			throw new IllegalArgumentException("Invalid logical operator "+ logic.operand);
		}
	}

	public void arithmetic(Arithmetic arith) {
		switch (arith.operand) {
		case "+":
			add(arith.getType().getSuffix());
			break;
		case "-":
			sub(arith.getType().getSuffix());
			break;
		case "*":
			mul(arith.getType().getSuffix());
			break;
		case "/":
			div(arith.getType().getSuffix());
			break;
		case "%":
			mod(arith.getType().getSuffix());
			break;
		default:
			throw new IllegalArgumentException("Invalid comparison operator " + arith.operand);
		}

	}
	
	public void line(int line) {
		out.println("#line\t"+line);
	}
	
	public void source() {
		out.print("#source\t");
		out.println("\""+filename+"\"");
	}
}
