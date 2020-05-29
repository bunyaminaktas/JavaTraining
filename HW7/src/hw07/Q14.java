package hw07;

interface Run {
	default void walk() {
		System.out.print("Walking and running!");
	}
}

interface Jog {
	default void walk() {
		System.out.print("Walking and jogging!");
	}
}

// Class name Sprint has been changed to Q14
public class Q14 implements Run, Jog {
	public void walk() {
		System.out.print("Sprinting!");
	}
	/*
	 * - Since this main() method is missing String[] parameter, Java cannot start this program.
	 */
	public static void main() {
		new Q14().walk();
	}
}
