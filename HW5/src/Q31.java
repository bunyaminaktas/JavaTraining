
public class Q31 {
	public static void main(String[] args) {
		int k = 0;
		for (int i = 10; i > 0; i--) {
			/*
			 * - This loop will iterate as:
			 * 1) 10 - 3 = 7 (new value of i)
			 * 2) 7  - 3 = 4 (new value of i)
			 * 3) 4  - 3 = 1 (new value of i)
			 * 
			 * - Now i is not greater than 3, while loop terminates.
			 */
			while (i > 3) i -= 3;
			
			// k will be incremented by 1.
			k += 1;
			
			// i is 1. The loop will terminate after this iteration.
		}
		System.out.println(k);
	}
}
