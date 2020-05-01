
public class Q30 {
	public static void main(String...strings)
	{
		int x = 10, y = 5;
		boolean w = true, z = false;
		x = w ? y++ : y--; // w is true, so y++ will be evaluated. Original value of y will be assigned to x
							// then y will be incremented by 1.
		w = !z;	// z is false, so !z will be true which will make w true, which actually means no change in w.
		System.out.print((x+y)+" "+(w ? 5 : 10)); // First parentheses is a numeric addition. The second one
													// is a ternary operator which evaluates the second operand.
	}
}
