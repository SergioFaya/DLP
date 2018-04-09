package ast.program.definitions;

import ast.program.Type;
import visitor.Visitor;

public class Field extends AbstractDefinition{

	public Type type;
	public String name;
	public int scope;
	
	public Field(int line, int column,Type type, String name) {
		super(line, column,type,name);
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Field [type=" + type + ", name=" + name + ", line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Field other = (Field) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int getScope() {
		return scope;
	}

	@Override
	public void setScope(int scope) {
		this.scope = scope;		
	}
	
	@Override
	public Type getType() {
		return type;
	}
	
}
