package hw8;

// Class name Stranger has been changed to Q28
public class Q28 {
	public static String getFullName(String firstName, String lastName) {
		try {
			return firstName.toString() + " " + lastName.toString();
		} catch (NullPointerException npe) {
			System.out.print("Problem?");
		} finally {
			System.out.print("Finished!");
		}
		
		//Original code
		/*
		 * - try-catch-finally statement must be in order try block - catch block(s) - finally block.
		 * Since finally block comes before the catch block here, this code does not compile.
		 */
		/*
		try {
			return firstName.toString() + " " + lastName.toString();
		} finally {
			System.out.print("Finished!");
		} catch (NullPointerException npe) {
			System.out.print("Problem?");
		}
		*/
		return null;
	}
	public static void main(String[] things) {
		System.out.print(getFullName("Joyce", "Hopper"));
		
		// Test null object
		System.out.println("\n" + getFullName(null, "Hopper"));
	}
}
