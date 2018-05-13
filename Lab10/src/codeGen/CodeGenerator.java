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

	public void push(String suffix, Number n) {
		print("push");
		print(suffix);
		print(" ");
		println(n.toString());
	}

	public void pushBp() {
		println("push bp");
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

	// Arithmetic operations
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

	// Comparison operations
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

	// Logical operations
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
	private void b2i() {
		println("b2i");
	}

	private void i2f() {
		println("i2f");
	}

	private void f2i() {
		println("f2i");
	}

	private void i2b() {
		println("i2b");
	}

	public void convertTo(Type type1, Type type2) {
		String suffix1 = type1.getSuffix();
		String suffix2 = type2.getSuffix();
		String op = suffix1 + "2" + suffix2;
		switch (op) {
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
		default:
			throw new IllegalArgumentException("Cannot apply conversion operation " + op);
		}
	}

	// Jumps
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

	// Functions
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

	// Loging of the mapl code

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
			throw new IllegalArgumentException("Invalid comparison operator");
		}
	}

	public void logical(Logical logic) {
		switch (logic.operand) {
		case "and":
			and();
			break;
		case "or":
			or();
			break;
		default:
			throw new IllegalArgumentException("Invalid comparison operator");
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
		default:
			throw new IllegalArgumentException("Invalid comparison operator");
		}

	}

}
