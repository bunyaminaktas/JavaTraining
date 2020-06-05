package hw8;

public class Q45 {
	public static void main(String[] args) {
		/*
		 * - Order of catch blocks matter when there is a hierarchy between exception types.
		 * 
		 * - IllegalArgumentException and ClassCastException are not related to each other so the order does
		 * not matter.
		 */
		
		try {
			throw new RuntimeException();
		} catch (IllegalArgumentException iae) {} 
		catch (ClassCastException cce) {}
		
		try {
			throw new RuntimeException();
		} catch (ClassCastException cce) {}
		catch (IllegalArgumentException iae) {} 
	}
}
