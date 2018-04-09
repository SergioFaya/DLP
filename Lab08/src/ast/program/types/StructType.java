package ast.program.types;

import java.util.List;

import ast.program.Type;
import ast.program.definitions.Field;
import visitor.Visitor;

public class StructType extends AbstractType {
	//AKA RecordType
	public List<Field> fields;

	public StructType(int line, int column, List<Field> fields) {
		super(line, column);
		this.fields = fields;
	}

	@Override
	public String toString() {
		return "StructType [fields=" + fields + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP p) {
		return visitor.visit(this, p);
	}

	@Override
	public Type dot(String str) {
		for (Field field : fields) {
			if(field.name.equals(str)) {
				return field.getType();
			}
		}
			return super.dot(str);
	}

}
