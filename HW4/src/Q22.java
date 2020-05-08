
public class Q22 {
	public static void addStationName(String[] names) {
		/*
		 * - If an array has n elements then n. element can be accessed at index n-1
		 * 
		 * - This statement tries to access the last element via n. index that does not exist.
		 * 
		 * - This statement will throw out an exception error at runtime.
		 */
		names[names.length] = "Times Square";
	}
	public static void main(String...strings) {
		String [] names = {"Waterloo", "New York"};
		addStationName(names);
	}
}
