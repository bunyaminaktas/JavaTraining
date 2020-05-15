
public class Q03 {
	public static void main(String[] args) {
		boolean check = false;
		
		/*
		 * - As it can be seen here, even if the boolean expression returns false
		 * the body executes once.
		 */
		do {
			System.out.println("do-while loop");
		}while(check);
		
		for(int i = 0; i < 0; i--) {
			System.out.println("for loop");
		}
		
		int nums[] = new int[0];
		for (int i : nums) {
			System.out.println("for-each loop");
		}		
		
		while (check) {
			System.out.println("while loop");
		}
	}
}
