package exercises;
/*
 * - Since this class returns a new copy object, any modifications made to that object does not affect the
 * data of this class. 
 */
public class ImmutableClass {
	private StringBuilder builder;
	public ImmutableClass(StringBuilder b) {
		builder = new StringBuilder(b);
	}
	public StringBuilder getBuilder() {
		return new StringBuilder(builder);
	}
}
