package sky;

public class Stars {
	private int inThe = 4;
	/*
	 * - This name is allowed since Java will know if the caller refers to constructor or a method
	 * by new keyword. Also references cannot invoke the constructor so that when a reference calls Stars() Java
	 * will know it refers to the method.
	 */
	
	public void Stars() {
		/*
		 * - super() must be the first entry of a class. But this is method so that it may not be the first entry
		 * used of a class. So the code does not compile.
		 */
		//super();
	}
	public Stars(int inThe) {
		// This line assigns the property inThe to itself. This is meaningless but not an error.
		this.inThe = this.inThe;
	}
	public static void main(String[] endless) {
		// The path of members can be explicitly stated.
		System.out.print(new sky.Stars(2).inThe);
	}
}
