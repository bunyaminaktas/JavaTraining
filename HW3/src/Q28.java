// Class name had to be changed to Q28
public class Q28 {
	public static void main(String... in) {
		int intersections = 100;
		int streets = 200;
		if(intersections < 150) {
			System.out.print("1");
		} else if (streets > 1000 && intersections > 1000) { // int variables are not allowed to be used in boolean operations.
			System.out.print("2");
		} if (streets < 500)
			System.out.print("1");
		else
			System.out.print("2");
		
		/* Original code
		 *
		if(intersections < 150) {
			System.out.print("1");
		} else if (streets && intersections > 1000) {
			System.out.print("2");
		} if (streets < 500)
			System.out.print("1");
		else
			System.out.print("2");
		 */
	}
}
