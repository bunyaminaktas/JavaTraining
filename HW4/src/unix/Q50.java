package unix;
import java.util.*;

// Class name had to be changed to Q50
public class Q50 {
	
	public static void main(String[] args) {
		Arrays.sort(args);
		int result = Arrays.binarySearch(args, args[0]);
		
		/*
		 * - Arrays.binarySearch() method returns an int value. If we try to assign this value 
		 * to a String variable, the code does not compile.
		 */
		
		// Original code
		// String result = Arrays.binarySearch(args, args[0]);

		System.out.println(result);
	}
}
