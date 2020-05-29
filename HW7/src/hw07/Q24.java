package hw07;

interface Sphere {
	default String getName() { return "Unknown"; }
}
abstract class Planet {
	abstract String getName();
}

// Class name Mars had to be changed to Q24 

public class Q24 extends Planet implements Sphere {
	public Q24() {
		super();
	}
	// Overriding method
	public String getName() { return "Mars"; }
	public static void main(final String[] probe) {
		System.out.print(((Planet)new Q24()).getName());
	}
}

// Original code.
// Interfaces cannot be extended rather implemented. Abstract classes cannot be implemented rather extended.
//public class Q24 extends Sphere implements Planet{}
