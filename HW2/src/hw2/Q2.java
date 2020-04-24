package hw2;

public class Q2 {
	public static void main(String... args) {
		String chair = "", table = "metal"; // chair variable must be initialized in order the code to compile.
		chair = chair + table; // this would not compile without initializing one of the variables used.
		System.out.println(chair);
	}
	
	// Original code
	/*
	public static void main(String... args) {
		String chair, table = "metal"; // chair variable must be initialized in order the code to compile.
		chair = chair + table; // does not compile.
		System.out.println(chair);
	}
	*/
}