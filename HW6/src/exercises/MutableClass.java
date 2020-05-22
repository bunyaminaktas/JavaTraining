package exercises;

public class MutableClass {
	private StringBuilder builder;
	public MutableClass(StringBuilder b) {
		builder = b;
	}
	public StringBuilder getBuilder() {
		return builder;
	}
}
