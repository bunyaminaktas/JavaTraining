
public class Q49 {
	public static void main(String[] args) {
		boolean baloonInflated = false;
		do {
			/* ! operator negates boolean values.
			 * The body will be executed since balloonInflated is false
			 * and when it is negated it becomes true.
			 */
			if (!baloonInflated) { 
				baloonInflated = true;
				System.out.print("inflate-");
			}
			/*
			 * - baloonInflated is now true so that the loop never terminates.
			 * so we can fix this problem by negating again.
			 */
		} while (!baloonInflated);
		System.out.println("done");
		
		/* Original code
		 *
		 do {
			 // ! operator negates boolean values.
			 // The body will be executed since balloonInflated is false
			 // and when it is negated it becomes true.
			 
			if (!baloonInflated) { 
				baloonInflated = true;
				System.out.print("inflate-");
			}			
			// - baloonInflated is now true so that the loop never terminates.			 
		} while (baloonInflated);
		*/
	}
}
