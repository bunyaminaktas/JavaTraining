package hw8;

// Class name has been changed to Q24
public class Q24 {
	public void compute() throws Exception{
		throw new RuntimeException("Error processing request");
	}

	/*
	 * - compute() method declares that it could throw an exception. This exception is a checked ,
	 * exception so that it must be handled or declared.
	 */
	public static void main(String[] bits) throws Exception {
		try {
			new Q24().compute(); 
			System.out.print("Ping");
		} catch (NullPointerException e) {
			System.out.print("Pong");
			throw e;
		}
	}
}
