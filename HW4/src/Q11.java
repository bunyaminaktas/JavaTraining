
public class Q11 {
	public static void main(String...strings) {
		int[] numbersOfSize10 = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("First element: " + numbersOfSize10[0]);
		System.out.println("Last element: " + numbersOfSize10[numbersOfSize10.length - 1]);
		
		// If we try to use [.length], then it will index to 10 which will throw out an
			// ArrayIndexOutOfBoundsException error.
		System.out.println("Last element: " + numbersOfSize10[numbersOfSize10.length ]);
	}
}
