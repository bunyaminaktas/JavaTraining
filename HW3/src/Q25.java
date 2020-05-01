// Class name had to be changed to Q25
public class Q25 {
	public static String travel(int distance) {
		return distance<1000 ? "train" : "10";
		
		/* - This code will not compile because this method must return a String value but
		 * the ternary operator contains a numeric value.
		 */
		// return distance<1000 ? "train" : 10;
	}
	public static void main(String[] answer) {
		System.out.print(travel(500));
	}
}
