package exercises;

public class ImmutableClass {
	private StringBuilder builder;
	public ImmutableClass(StringBuilder b) {
		builder = new StringBuilder(b);
	}
	public StringBuilder getBuilder() {
		return new StringBuilder(builder);
	}
}
