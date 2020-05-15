
public class Q27 {
	public static void main(String[] args) {
		boolean balloonInflated = false;
		do {
			/* ! operator negates boolean values.
			 * - The body will be executed since balloonInflated is false
			 * and when it is negated it becomes true.
			 */
			if(! balloonInflated) {
				balloonInflated = true;
				System.out.print("inflate-");
			}
			/*
			 * - The loop terminates since the balloonInflated is now true and 
			 * when it is negated it becomes false.
			 */
		}while(! balloonInflated);
		System.out.println("done");
	}
}
