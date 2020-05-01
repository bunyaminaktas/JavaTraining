
public class Q27 {
	public static void main(String...strings)
	{
		String myTestVariable = new String("Hello");
		
		/*
		 * - The code does not produce an exception because the method is called on an object that is not null.
		 * - Since null means no object, which also means there is no String value, the method returns false.
		 */
		System.out.print(myTestVariable.equals(null));
	}
}
