import java.util.*;

public class Q12 {
	public static void main(String[] args) {
		/*
		 * - Array.asList has a varargs parameter
		 * - varargs takes arrays as argument or takes individual variables as
		 * argument and converts them into array.
		 * 
		 * - Finally Arrays.asList() converts this array into a List
		 */
		List<String> drinks = Arrays.asList("can", "cup");
		
		/*
		 * - This for loop will iterate through the list converted from an array,
		 * starting from the end.
		 */
		for(int container = drinks.size() - 1; container >= 0; container--)
			System.out.print(drinks.get(container) + ",");
	}
}
