import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ast.Program;
import errorHandler.ErrorHandler;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import parser.CmmLexer;
import parser.CmmParser;
import visitor.IdentificationVisitor;
import visitor.TypeCheckingVisitor;

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
		p.accept(new TypeCheckingVisitor(), null);
		
		if (ErrorHandler.getInstance().anyError()) {
			ErrorHandler.getInstance().showError(System.err);
		} else {
			//p.accept(new OffsetVisitor(), null);
			IntrospectorModel model = new IntrospectorModel("Program", p);
			new IntrospectorTree("Introspector", model);
		}
	}
}
