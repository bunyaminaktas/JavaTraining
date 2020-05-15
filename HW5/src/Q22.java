
public class Q22 {
	public static void main(String[] args) {
		String[] fun = new String[] {"Hello", "World", "!"};
		
		//Original loop implementation
		/*
		 * - This loop iterates through the array fun
		 */
		for(int i = 0; i<fun.length; i++)
			System.out.println(fun[i]);
		
		// for-each loop implementation
		/*
		 * - for-each loop takes a variable of type that is 
		 * same as the type of the members of the array to be iterated through.
		 * 
		 * - Then a colon follows with the reference name of the array.
		 * 
		 * - Equal sign is not used in this loop's signature.
		 */
		for (String f : fun) System.out.println(f);
		
		//for(String f = fun) System.out.println(f);
		
		//for(String = fun) System.out.println(it);
		
		
	}
}
