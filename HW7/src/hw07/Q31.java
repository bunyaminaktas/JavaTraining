package hw07;
abstract class Parallelogram {
	private int getEqualSides() { return 0; }
}
abstract class Rectangle extends Parallelogram {
	public static int getEqualSides() { return 2; }
}

// Class name Square has been changed to Q31
public final class Q31 extends Rectangle {
	/*
	 * - Static methods cannot be overridden. They can only be hidden so that static modifier must be put on this method.
	 */
	public static int getEqualSides() { return 4; }
	//public int getEqualSides() { return 4; } // x2 // original line
	public static void main(String[] corners) {
		final Q31 myFigure = new Q31(); // x3
		System.out.print(myFigure.getEqualSides());
	}
}
