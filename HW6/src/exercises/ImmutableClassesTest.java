package exercises;

public class ImmutableClassesTest {
	public static void main(String[] args) {
		/*
		 * - Since this class returns a reference to the original object,
		 * that object can be modified, so this class is not immutable.
		 */
		MutableClass mc = new MutableClass(new StringBuilder("Hello"));
		StringBuilder sb = mc.getBuilder();
		sb.append(" World");
		System.out.println(mc.getBuilder());
		
		/*
		 * - This class returns a copy of the original object so that the original object
		 * cannot be modified so this class is immutable.
		 */
		ImmutableClass ic = new ImmutableClass(new StringBuilder("Hello"));
		StringBuilder sb2 = ic.getBuilder();
		sb2.append(" World");
		System.out.println(ic.getBuilder());
	}
}
