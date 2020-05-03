
public class Q47 {
	public static void main(String...strings)
	{
		/*
		 * Logical complement operator can only be applied to boolean values.
		 */
		// Original statement
		//System.out.print((5 + (!2 + 8) * 3 - 3 % 2)/2);
		
		// If the error is fixed such as below, the output will be 17.
		System.out.print((5 + (2 + 8) * 3 - 3 % 2)/2);
	}
}
