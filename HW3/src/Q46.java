// Class name had to be changed to Q46
public class Q46 {
	public static void main(String... weather) {
		/*
		 * - If weather[0] does not exist then the application will throw an exception
		 * - If it exists then the application will print either "Go outside" or "Stay inside".
		 * - There is no possibility that the application prints nothing.
		 */
		System.out.print(weather[0]!=null 
				&& weather[0].equals("sunny") 
				&& !false 
				? "Go outside" : "Stay inside");
	}
}
