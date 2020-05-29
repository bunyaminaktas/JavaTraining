package hw07;

class Cinema {
	private String name;
	public Cinema(String name) { this.name = name; }
	/*
	 * - This method is added here to reach to property name.
	 */
	public String getName() {
		return name;
	}
}

// Class name Movie is changed to Q01
public class Q01 extends Cinema {
	/*
	 * - Since the parent class does not have a no-argument constructor the subclasses must have implement
	 * an explicit constructor appending super() with the required arguments to the first line of the constructor.
	 */
	public Q01(String movie) { super(movie); }
	
	/*
	 * - Since the parent class's name property is private, it cannot be reached from outside.
	 */
	public static void main(String[] showing) {
		System.out.println(new Q01("Another Trilogy").getName());
	}
	
	// Original code
	/* 
	public Movie(String movie) {}
	public static void main(String[] showing) {
		System.out.println(new Movie("Another Trilogy").name);
	}
	*/
}
