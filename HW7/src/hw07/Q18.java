package hw07;

abstract class Triangle {
	abstract String getDescription();
}
class RightTriangle extends Triangle {
	// Overriding getDescription with a broader access modifier which is legal.
	protected String getDescription() { return "rt"; } // g1
}

// Class name IsoscelesRightTriangle has been changed to Q18
public abstract class Q18 extends RightTriangle { // g2
	// Overriding getDescription with a broader access modifier, again, which is legal.
	public String getDescription() { return "irt"; }
	public static void main(String[] edges) {
		// An abstract class cannot be instantiated directly
		//final Triangle shape = new Q18();	// g3
		final Triangle shape = new RightTriangle();
		System.out.print(shape.getDescription());
	}
}
