package hw8;

public class Q31 {
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException re) {
			throw new RuntimeException();
		} finally {
			/*
			 * - If finally block throws an exception, the caller will see only this.
			 * 
			 * - Possible exceptions that might be thrown by the catch block will be forgotten. This is
			 * because that finally block is executed whatever happens in catch block and when an exception
			 * is thrown by the finally block, the program continues with that exception and forgets about
			 * the previous exception.
			 */
			throw new RuntimeException();
		}
	}
}
