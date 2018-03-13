package ast.program.definitions;

import java.util.List;

import ast.program.Statement;
import ast.program.Type;
import visitor.Visitor;

public class FuncDefinition extends AbstractDefinition implements Statement {

	public List<Statement> body;

	public FuncDefinition(int line, int column,Type type,String name, List<Statement> body) {
		super(line, column,type,name);
		this.body = body;
	}

	@Override
	public String toString() {
		return "FuncDefinition [body=" + body + ", type=" + type + ", name=" + name + ", line=" + line + ", column="
				+ column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
}
