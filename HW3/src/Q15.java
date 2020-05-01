
public class Q15 {
	public static void main(String...strings)
	{
		int hops = 0;
		int jumps = 0;
		// hops is incremented by 1 but outputs 0 because here post-unary operator is used.
		jumps = hops++;
		
		/*
		 * numerals cannot be used for boolean expressions
		 */
		/*
		if(jumps)
			System.out.print("Jump!");
		else
			System.out.print("Hop!");
		 */
		
		System.out.print(jumps);
	}
	
}
