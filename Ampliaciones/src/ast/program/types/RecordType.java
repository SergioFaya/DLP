package ast.program.types;

import java.util.List;

import ast.program.Type;
import ast.program.definitions.Field;
import visitor.Visitor;

public class RecordType extends AbstractType {

	public List<Field> fields;
	private int numberOfBytes;
	
	public RecordType(int line, int column, List<Field> fields) {
		super(line, column);
		this.fields = fields;
	}

	@Override
	public String toString() {
		return "RecordType [fields=" + fields + "]";
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
			return null;
	}

	@Override
	public int getNumberOfBytes() {
		return fields.stream().mapToInt(b-> b.getType().getNumberOfBytes()).sum();
	}

	@Override
	public void setNumberOfBytes(int numberOfBytes) {
		this.numberOfBytes = numberOfBytes;
	}

	@Override
	public String getSuffix() {
		System.out.println(line);
		throw new RuntimeException();
		//return "a";
	}

}
