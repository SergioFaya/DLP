package ast.program.definitions;

import java.util.List;

import ast.program.Statement;
import ast.program.Type;

public class FuncDefinition extends AbstractDefinition implements Statement {

	protected List<Statement> body;
	protected List<VarDefinition> param;

	public FuncDefinition(int line, int column,Type type,String name,List<VarDefinition> param, List<Statement> body) {
		super(line, column,type,name);
		this.param = param;
		this.body = body;
	}

	@Override
	public String toString() {
		return "FuncDefinition [body=" + body + ", param=" + param + ", type=" + type + ", name=" + name + ", line="
				+ line + ", column=" + column + "]";
	}

	
}
