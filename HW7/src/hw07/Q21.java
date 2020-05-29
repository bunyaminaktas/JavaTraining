package hw07;

abstract class Book {
	protected static String material = "papyrus";
	/*
	 * - Abstract classes can have constructors. These constructors are used in subclasses.
	 */
	public Book() {}
	public Book(String material) { this.material = material; }
}

// Class name Encyclopedia has been changed to Q21
public class Q21 extends Book {
	public static String material = "cellulose"; // hiding variable of the parent class.
	public Q21() { super(); }
	public String getMaterial() { return super.material; /* calss parent class*/ } 
	public static void main(String[] pages) {
		System.out.println(new Q21().getMaterial());
	}
}
