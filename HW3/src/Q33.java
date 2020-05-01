
public class Q33 {
	public static void main(String...strings) {
		/*
		 * The operator ^, exclusive OR, evaluates to false if both operands are same.
		 */
		System.out.println("		| p = true | p = false");
		System.out.println("| q = true	| " + (true^true) + "    | " + (true^false));
		System.out.println("| q = false	| " + (false^true) + "     | " + (false^false));
	}
}
