
public class Q11 {
	public static void main(String[] args) {
		// A fixed way of the code. 
		int singer = 0;
		while(singer <= 0) {
			System.out.println(singer++);
		}
		
		/*
		 * - Original code does not compile because integer values cannot be used
		 * in place of boolean values in Java.
		 */
		
		/*
		int singer = 0;
		while(singer) {
			System.out.println(singer++);
		}
		*/
	}
}
