package hw8;
class Organ{
	public void operate() throws RuntimeException{
		throw new RuntimeException("Not supported");
	}
}
// Class name Heart has been changed to Q38
public class Q38 extends Organ {
	/*
	 * - Overridden methods cannot declare a new exception.
	 */
	public void operate() throws RuntimeException{
		System.out.print("beat");
	}
	public static void main(String... cholesterol) throws Exception {
		try {
			new Q38().operate();
		} finally {
			
		}
	}
}
