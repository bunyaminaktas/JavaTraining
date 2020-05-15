package nyc;

// Class name had to be changed to Q50
public class Q50 {
	public static void main(String... args) {
		String[] nycTourLoops = new String[] { "Downtown", "Uptown", 
				"Brooklyn" };
		String[] times = new String[] { "Day", "Night" };
			/*
			 * - In order to initialize more than one variables in 
			 * initialization segment we must separate them with a comma and 
			 * make them same data type. 
			 * 
			 * - In Java a semicolon also means a statement that a statement
			 * can only have one data type word. 
			 */
			for(int i = 0, j = 0; i < 1; i++, j++)
				System.out.print(nycTourLoops[i] + " " + times[j]);
	}
}
