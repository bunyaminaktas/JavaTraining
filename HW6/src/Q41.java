
public class Q41 {
	
	public void call(int count, String me, String... data) {}
	public void test() {
		/*
		 * - call() method must take at least one int argument and one String argument, respectively.
		 * It may not have any argument for vararg parameter. If it does, though, the arguments must be of type
		 * String.
		 */
		
		// This call has an argument that is int for vararg parameter. Since vararg is String this call is not valid. 
		//call(9,"me", 10, "Al");
		
		// This call is missing the String argument
		//call(5);
		
		/*
		 * - This call is valid since the first int argument and the second String argument is what is needed.
		 * And the last String argument goes for the vararg parameter.
		 */
		
		call(2,"home","sweet");
		
		// This method is missing int argument which is needed for first parameter of the method.
		//call("answering","service");
	}
}
