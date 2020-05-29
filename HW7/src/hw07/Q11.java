package hw07;

class Computer {
	protected int process() { return 5; }
	
	/*
	 * - Since this method has modifer final, it cannot be overridden.
	 */
	//protected final int process() { return 5; }
}

// Class name Laptop had to be changed to Q11
public class Q11 extends Computer{
	public final int process() { return 3; }
	public static void main(String[] chips) {
		System.out.println(new Q11().process());
	}
}
