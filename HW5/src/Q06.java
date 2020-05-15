
public class Q06 {
	public static void main(String[] args) {
		// break statement
		int i = 0;
		for(i = 0; i < 2; i++) {
			if(i == 0) {
				break;
			}
		}
		if(i == 0) {
			System.out.println("break terminates the loop immediately");
		}
		
		// continue statement
		for(i = 0; i < 2; i++) {
			if(i == 0) {
				continue;
			}
		}
		if(i == 2) {
			System.out.println("continue ends the loop and proceeds to next"
					+ "iteration");
		}
				
		/*
		 * - There is no keyword called end or skip.
		 */
		for(i = 0; i < 2; i++) {
			if(i == 0) {
				//end;
				//skip;
			}
		}
	}
}
