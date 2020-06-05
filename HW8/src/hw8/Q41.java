package hw8;

import javax.management.RuntimeErrorException;

// Class name has been changed to Q50
public class Q41 {
	public static void main(String... hammer) {
		try {
			throw new ClassCastException(); // throwing a ClassCastException which is a child of RuntimeException.
		}catch (IllegalArgumentException e) { // cannot catch ClassCastException since IllegalArgumentException is
												// not related to it.
			throw new IllegalArgumentException();
		} catch (RuntimeException e) { // catches the exception since RuntimeException is superclass of it.
			throw new NullPointerException(); // throwing a new runtime exception.
		}finally {
			throw new RuntimeException(); // throwing a RuntimeException making the previous exception forgotten.
		}
	}
}
