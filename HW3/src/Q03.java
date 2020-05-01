
// Class name NameCheck had to be changed to Q03
public class Q03 {
	public static void main(String... data)
	{
		/*
		 * - Equality operator, ==, checks if the objects are same rather than their value
		 * while equals() methods checks the value stored in the objects. Objects john and jon are not
		 * same objects while their value are same. So the first statement in System.out.println() will
		 * return false while the second will return true.
		 */
		String john = "john";
		String jon = new String("john");
		System.out.print((john==jon)+" "+(john.equals(jon)));
	}
}
