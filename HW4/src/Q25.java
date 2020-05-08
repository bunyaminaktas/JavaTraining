import java.util.Arrays;

public class Q25 {
	public static void main(String...args) {
		String[] strings = new String[2];
		
		// Prints the reference
		System.out.println(strings);
		
		/*
		 * - When we try to print the aray with Arrays.toString() method, it will print [null, null]
		 * because the array values are not initialized explicitly. 
		 */
		System.out.println(Arrays.toString(strings));
	}
}
