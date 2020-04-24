package hw2;

public class Q39 {
	int age = 5;			// Instance variable
	static int size = 170;	// Static variable
	
	/*
	 * Instance methods can call instance and static members
	 */
	public void instanceMethod() {
		System.out.print(age);
		System.out.print(size);
	}
	
	/*
	 * Static methods can call only static members.
	 */
	public static void staticMethod() {
		System.out.print(new Q39().age); // Instance variables cannot be called within static methods
											// without creating objects.
		System.out.print(size);
	}
}
