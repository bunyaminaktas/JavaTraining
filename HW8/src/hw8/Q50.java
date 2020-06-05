package hw8;

// Class name has been changed to Q50
public class Q50 {
	public static void snore() {
		try {
			String sheep[] = new String[3];
			System.out.print(sheep[3]); // throws ArrayIndexOutOfBoundsException because the statement attempts to 
											// reach the fourth element which does not exist.
		} catch (RuntimeException e) {
			System.out.print("Awake!");
		} finally {
			// Original code
			/*
			 * - Checked exception must be handled or declared.
			 */
			//throw new Exception();	//x1
			try {
				throw new Exception();
			} catch (Exception e) {
			}
		}
	}
	public static void main(String... sheep) {		// x2
		new Q50().snore();		// x3
	}
}
