package hw8;

// Class name had to be changed to Q01
public class Q01 {
	public static void think() throws Exception { //k1
		try {
			throw new Exception();
		} 
		/*
		 * - A try statement must be followed by a catch or a finally block. If none
		 * exists then the code does not compile
		 */
		catch(Exception e) {
			
		}
	}
	public static void main (String... ideas) throws Exception {
		think();
	}
	
}
