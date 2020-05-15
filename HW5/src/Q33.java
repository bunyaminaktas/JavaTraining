import java.util.*;

public class Q33 {
	public static void main(String[] args) {
		/*
		 * - Array.asList has a varargs parameter
		 * - varargs takes arrays as argument or takes individual variables as
		 * argument and converts them into array.
		 * 
		 * - Finally Arrays.asList() converts this array into a List
		 */
		List<String> bottles = Arrays.asList("glass", "plastic");
		
		/*
		 * - for loop will print the first item of the array and then will be
		 * terminated by break statement.
		 */
		for(int type = 0; type < bottles.size();) {
			System.out.print(bottles.get(type) + ",");
			break;
		}
		System.out.print("end");
		
		// Original code
		/*
		 * - Since break statement is used outside of a loop/switch
		 * this code does not compile.
		 * 
		 * - But if break was not used, then this loop would never terminate 
		 * since type is never updated. So the loop would be infinite.
		 * 
		 *  - The solution for this error is to encapsulate the 2 statements
		 *  after the for loop signature between brackets.
		 */
		
		/*
		List<String> bottles = Arrays.asList("glass", "plastic");
		for(int type = 0; type < bottles.size();)
			System.out.print(bottles.get(type) + ",");
			break;
		System.out.print("end");
		*/
	}
}
