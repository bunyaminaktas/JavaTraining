package hw8;

public class Q33 {
	public static void main(String[] args) {
		final Object exception = new Exception();
		/*
		 * - exception does not reference to a RuntimeException object or to a child object of RuntimeException
		 * so this assignment will throw a ClassCastException.
		 */
		final Exception data = (RuntimeException)exception;
		System.out.print(data);
	}
}
