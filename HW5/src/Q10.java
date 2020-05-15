
public class Q10 {
	public static void main(String[] args) {
		int index = 0;
		
		// do-while loops executes the body first and then checks the boolean expression.
		do {
			if (index == 0)
				System.out.println("This loop executed the body first,"
						+ " then checked the value of index");
		}while(index != 0);
		
		/*
		 * - This loop will not output anything because it will check if the value
		 * of i equals to 0 and since it returns false the loop will terminate 
		 * immediately. 
		 */
		for(int i = 0; i != 0; i++) {
			System.out.println("This loop executed the body first,"
					+ " then checked the value of index");
		}
		
		/*
		 * - For-each loops also firstly check the boolean expression.
		 */
		int array[] = new int[] {};
		for(int i : array) {
			System.out.println("This loop executed the body first,"
					+ " then checked if the array has a next member");
		}
		
		/*
		 * - While loops firstly check the boolean expression, too.
		 */
		while(index != 0) {
			System.out.println("This loop executed the body first,"
					+ " then checked the value of index");
		}
	}
}
