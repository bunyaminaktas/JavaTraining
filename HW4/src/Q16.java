
public class Q16 {
	public static void main(String...strings) {
		String[][] matrix = new String[1][2];						
		matrix[0][0] = "Don't think you are, know you are."; 		// m1
		matrix[0][1] = "I'm trying to free your mind Neo";			// m2
		
		/* - The next two lines are trying to access to second element of the first dimension of the 2D array
	 	 * matrix which does not exist. So when Java encounters the first line, m3, it will throw out
	 	 * ArrayIndexOutOfBoundsException error.
	 	 */
		matrix[1][0] = "Is all around you";							// m3
		matrix[1][1] = "Why oh why didn't I take the BLUE pill?";	// m4
	}
}
