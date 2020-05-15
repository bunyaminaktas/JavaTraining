
public class Q34 {
	public static void main(String[] args) {
		String[] nycTourLoops = new String[] {"Downtown", "Uptown", "Brooklyn" };
		String[] times = new String[] { "Day", "Night" };
		/*
		 * - Fixed the loop replacing the semi-colon with a comma.
		 * 
		 * - for loops accepts more than one statements in initialization 
		 * and update segments as long as they are separated by a comma. 
		 * Additionally, the variables initialized in initialization segment
		 * must be of same data type.
		 */
		for(int i = 0, j = 0; i < nycTourLoops.length 
				&& j < times.length; i++, j++)
		{
			System.out.print(nycTourLoops[i] + " " + times[j] + "-");
		}
		
		// Original implementation of the for loop
		/*
		for(int i = 0, j = 0; i < nycTourLoops.length 
				&& j < times.length; i++; j++)
		{
			System.out.print(nycTourLoops[i] + " " + times[j] + "-");
		}
		*/
	}
}
