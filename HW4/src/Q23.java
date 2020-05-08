
public class Q23 {
	public static void main(String...strings) {
		String[] days = new String[] {"Sunday", "Monday", "Tuesday",
				"Wednesday", "Thursday", "Friday", "Saturday" };
		for (int i = 0; i < days.length; i++)
			System.out.println(days[i]);
		
		//size() method cannot be invoked on arrays.
		/*
		for (int i = 0; i < days.size(); i++)
			System.out.println(days[i]);
		*/
	}
}
