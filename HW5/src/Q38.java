
public class Q38 {
	private static int count;
	private static String[] stops = new String[] {"Washington",
			"Monroe", "Jackson", "LaSalle" };
	public static void main(String[] agrs) {
		while(count < stops.length) {
			/*
			 * - While checking if the element at index count++,
			 * the value of count is incremented by 1.
			 */
			if(stops[count++].length() < 8) {
				continue; // ends the current iteration of the loop
							// this is actually unnecessary since the iteration would end anyway.
			}
		}
		System.out.println(count);
	}
	
}
