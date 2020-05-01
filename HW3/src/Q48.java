
public class Q48 {
	public static void main(String...strings) {
		/*
		 * The operator ||, OR, evaluates to false if both operands are false.
		 */
		System.out.println("		| p = true | p = false");
		System.out.println("| q = true	| " + (true||true) + "     | " + (true||false));
		System.out.println("| q = false	| " + (false||true) + "     | " + (false||false));
	}
}
