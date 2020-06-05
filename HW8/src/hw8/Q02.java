package hw8;

public class Q02 {
	public static void main(String[] args) {
		// Option A
		//catch(Exception e) {} // Since a catch block cannot come before a try block, this does not compile.
		// The next two lines are considered an independent try-finally statement.
		//try {}
		//finally {}
		
		// Option B
		/*
		 * try-catch statements must be in order try, catch and/or finally blocks.
		 */
		try {} catch(Exception e ) {} finally {}
		
		// Option C
		/*
		 * finally and catch blocks can never come before a try block.
		 */
		//finally{} catch(Exception e) {} try {}
		
		// Option D
		try {} 
		finally {}
		// A catch block cannot come after a finally block.
		//catch(Exception e) {}
		
	}
}
