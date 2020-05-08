package unix;
import java.util.*;
// Class name had to be changed to Q32
public class Q32 {
	
	public static void main(String[] args) {
		// The first argument which is seed, is assigned to one
		String one = args[0];
		
		// args array are sorted, becomes [flower, seed]
		Arrays.sort(args);
		
		// The value of one, which is seed, is searched and since it is second element, returned 1.
		
		int result = Arrays.binarySearch(args, one);
		System.out.println(result);
	}
}
