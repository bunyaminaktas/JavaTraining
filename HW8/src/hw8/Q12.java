package hw8;

// Class name has been changed to Q12
public class Q12 {
	public static void main(String[] dribble) {
		try {
			System.out.print(1);
			throw new ClassCastException();
		} catch (ArrayIndexOutOfBoundsException ex) { // since the thrown exception is not related to this one
														// this block will be skipped.
			System.out.print(2);
		} catch (Throwable ex) { // This is the superclass of all exceptions so it can handle any of them. 
			System.out.print(3);
		} finally {
			System.out.print(4);
		}
		System.out.print(5);
	}
}
