package ast.program.definitions;

import java.util.List;

import ast.program.Statement;
import ast.program.Type;
import visitor.Visitor;

public class FuncDefinition extends AbstractDefinition implements Statement {

	public List<Statement> body;
	private int scope;
	//Accumulate the bytes of the parameters
	public int totalLocalBytes;
	public int totalBytesParam;

	public FuncDefinition(int line, int column,Type functionType,String name, List<Statement> body) {
		super(line, column,functionType,name);
		this.body = body;
	}

	@Override
	public String toString() {
		return "FuncDefinition [body=" + body + ", type=" + type + ", name=" + getName() + ", line=" + line + ", column="
				+ column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}
	
	@Override
	public int getScope() {
		return scope;
	}

	@Override
	public void setScope(int scope) {
		this.scope = scope;		
	}
}
