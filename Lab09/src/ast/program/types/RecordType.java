package ast.program.types;

import java.util.List;

import ast.program.Type;
import ast.program.definitions.Field;
import visitor.Visitor;

public class RecordType extends AbstractType {

	public List<Field> fields;
	private int offset;
	
	public RecordType(int line, int column, List<Field> fields) {
		super(line, column);
		this.fields = fields;
	}

	@Override
	public String toString() {
		return "StructType [fields=" + fields + ", offset=" + offset + "]";
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
