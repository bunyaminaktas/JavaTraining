package peregrine;

// Class name had to be changed to Q14
public class Q15 {
	public static void main(String[] args) {
		/*
		 * - This is an infinite loop which never terminates.
		 * since the index of the loop is started from a number at least equals to 0
		 * and updated always as being incremented.
		 * 
		 * So the boolean expression, i>=0, will never return false.
		 */
		for(int i = args.length; i>=0; i++) {
			System.out.print("args");
		}
	}
}
