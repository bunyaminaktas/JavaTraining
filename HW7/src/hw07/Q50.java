package hw07;
import java.io.*;
class Machine {
	public boolean turnOn() throws EOFException { return true; }
}
// Class name Robot has been changed to Q50
public class Q50 extends Machine {
	/*
	 * - Overridden methods cannot throw an exception that is broader than the exception thrown in the parent
	 * class.
	 */
	//public boolean turnOn() throws IOException { return false; }
	public boolean turnOn() { return false; }
	public static void main(String[] doesNotCompute) throws Exception {
		Machine m = new Q50();
		System.out.print(m.turnOn());
	}
}
