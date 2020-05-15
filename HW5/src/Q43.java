import java.util.*;
//Class name had to be changed to Q43
public class Q43 {
	public static void main(String[] args) {
		/*
		 * - Array.asList has a varargs parameter
		 * - varargs takes arrays as argument or takes individual variables as
		 * argument and converts them into array.
		 * 
		 * - Finally Arrays.asList() converts this array into a List
		 */
		List<String> exams = Arrays.asList("OCA", "OCP");
		
		/*
		 * - for-each loops iterate over the same List named exams.
		 * 
		 * - Since exams has two elements the inner loop prints 2 lines in each
		 * iteration of outer loop because of the 2 elements of the List. 
		 */
		for(String e1 : exams)
			for (String e2 : exams)
				System.out.println(e1 + " " + e2);
	}
}
