// Class name had to be changed to Q27
public class Q27 {
	public static void main(String... original) {
		String[] copy = original;
		System.out.println(copy.length + " " + copy[0]);
		
		/*
		 * - Since varargs can only be used as parameters, this statement is not legal. 
		 */
		// Original code
		//String... copy = original;
		//System.out.println(copy.length + " " + copy[0]);
	}
}
