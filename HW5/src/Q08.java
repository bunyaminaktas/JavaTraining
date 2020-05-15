
public class Q08 {
	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5};
		
		// Traditional for loop can iterate through an array starting from index 0
		for(int i = 0; i < array.length; i++) {
			if(i > 0)
				System.out.print(",");
			System.out.print(array[i]);
		}
		System.out.println();
		
		// Traditional for loop can also iterate through an array starting from the end.
		for(int i = array.length - 1; i >= 0; i--) {
			if(i < array.length - 1)
				System.out.print(",");
			System.out.print(array[i]);
		}
	}
}
