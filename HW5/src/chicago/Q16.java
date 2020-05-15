package chicago;

// Class name had to be changed to Q16
public class Q16 {
	private static int count; // defaults to 0 because this is a class variable
	private static String[] stops = new String[] { "Washington",
		"Monrole", "Jackson", "LaSalle"};
	public static void main(String[] args) {
		/*
		 * - count starts from 0 because it defaults to zero since it is a class
		 * variable.
		 * 
		 * - while loop ensures the code not go beyond the limits of the arrays.
		 * 
		 * - Then an if-then statement checks length of the current element of the
		 * array and if it matches the desired length, break statement terminates the loop. 
		 */
		while (count < stops.length) {
			if(stops[count++].length() < 8) {
				break;
			}
		}
		System.out.println(count);
	}
}
