import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ast.Program;
import codeGen.OffsetVisitor;
import codeGen.codeFunctions.CodeFunctions;
import errorHandler.ErrorHandler;
import parser.CmmLexer;
import parser.CmmParser;
import semantic.IdentificationVisitor;
import semantic.TypeCheckingVisitor;

public class Main {

	public static void main(String... args) throws Exception {
		if (args.length < 1) {
			System.err.println("Please, pass me the input file.");
			return;
		}
		// create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		CmmLexer lexer = new CmmLexer(input);
		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CmmParser parser = new CmmParser(tokens);
		Program p = parser.program().ast;
		p.accept(new IdentificationVisitor(), null);
		stopOnError();
		p.accept(new TypeCheckingVisitor(), null);
		stopOnError();
		// generacion de codigo
		p.accept(new OffsetVisitor(), null);
		stopOnError();
		// CodeFunctions.setPrintStream(System.out);
		FileOutputStream stream = new FileOutputStream(new File("myoutput.txt"));
		PrintStream out = new PrintStream(stream);
		CodeFunctions.setFileName(args[0]);
		CodeFunctions.setPrintStream(out);
		p.accept(CodeFunctions.getExecute(), null);
		// IntrospectorModel model = new IntrospectorModel("Program", p);
		// new IntrospectorTree("Introspector", model);
	}

	public static void stopOnError() {
		if (ErrorHandler.getInstance().anyError()) {
			ErrorHandler.getInstance().showError(System.err);
			System.exit(0);
		}
	}
	
}
