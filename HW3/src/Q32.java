
public class Q32 {
	public static void main(String...strings) {
		/*
		 * - Order of evaluation:
		 * 1 - Parentheses
		 * 2 - Left-to-right multiplication/division/modulus
		 * 3 - Left-to-right addition/subtraction
		 */
		System.out.print(12 + 6 * 3 % (1 + 1));
	}
}
