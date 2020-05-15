import java.util.*;

public class Q20 {
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
		 * - The next traditional for loop will iterate through the list created above
		 */
		for(int container = 0; container < drinks.size(); container++)
			System.out.print(drinks.get(container) + ",");
	}
}
