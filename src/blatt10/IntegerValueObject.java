package blatt10;

public class IntegerValueObject {
	private final int i;

	public IntegerValueObject(int i) {
		this.i = i;
	}

	public IntegerValueObject add(int j) {
		return new IntegerValueObject(i + j);
	}

	public IntegerValueObject mul(int j) {
		return new IntegerValueObject(i * j);
	}

	@Override
	public String toString() {
		return "IntegerValueObject [i=" + i + "]";
	}
	
}
