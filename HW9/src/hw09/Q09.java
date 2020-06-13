package hw09;

public class Q09 {
	public static void main(String[] args) {
		/*
		 * - StringBuilder class is mutable so that methods called on StringBuilder objects, changes the data
		 * stored in them.
		 * 
		 * - append() method makes the value of b "123", whether the assignment occurs or not.
		 * 
		 * - reverse() method makes the value "321"
		 */
		StringBuilder b = new StringBuilder("12");
		b = b.append("3");
		b.reverse();
		System.out.println(b);
	}
}
