package hw8;
class DragonException extends Exception{}

// Class name has been changed to Q44
public class Q44 {
	public void openDrawbridge() {	// r1
		try {
			/*
			 * - throws a checked exception that is never caught since catch block catches only runtime exceptions.
			 * This is okay since the current method declares an Exception.
			 */
			throw new Exception("This Exception");	
		} catch (RuntimeException e) {
			throw new DragonException();	// r2
		} finally {
			/*
			 * - When this Exception is thrown, the exception from try block is forgotten.
			 */
			throw new RuntimeException("Or maybe this one");
		}
	}
	public static void main(String[] moat) throws Exception {
		/*
		 * - This statement is also valid since main() method declares Exception.
		 */
		new Q44().openDrawbridge();		// r3
	}
}
