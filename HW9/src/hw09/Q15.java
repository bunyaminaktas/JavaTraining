package hw09;

public class Q15 {

	public static void main(String[] args) {
		/*
		 * - String class is immutable so that unless String variables are reassigned they are not changed by the
		 * methods.
		 * - String class does not implement reverse() method.
		 */
		String b = "12";
		b += "3";
		//b.reverse();
		System.out.println(b.toString());

	}

}
