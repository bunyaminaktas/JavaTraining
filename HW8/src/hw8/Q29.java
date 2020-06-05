package hw8;

public class Q29 {
	public static void main(String[] args) {
		/*
		 * - A try statement must have at least one catch block and at most one finally block
		 */
		try {
			throw new Exception();
		}catch(Exception e) {
			
		} 
		// finally block is optional
		finally {
			
		}
	}
}
