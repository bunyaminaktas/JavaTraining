
public class Q35 {
	public static void main(String...strings) {
		String[] days = new String[] {"Sunday", "Monday", "Tuesday",
				"Wednesday", "Thursday", "Friday", "Saturday" };
		
		// This loop starts from the second element of the array days and attempts to reach the 7. element
			// which does not exist. So an exception will be thrown at runtime.
		for (int i = 1; i <= days.length; i++)
			System.out.println(days[i]);
	}
}
