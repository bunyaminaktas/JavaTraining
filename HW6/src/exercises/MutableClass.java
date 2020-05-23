package exercises;
/*
 * - Since this class returns a reference to the property object, the data in the object can be modified
 */
public class MutableClass {
	private StringBuilder builder;
	public MutableClass(StringBuilder b) {
		builder = b;
	}
	public StringBuilder getBuilder() {
		return builder;
	}
}
