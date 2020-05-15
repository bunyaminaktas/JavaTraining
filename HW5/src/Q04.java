
public class Q04 {
	public static void main(String[] args) {
		int index = 0;
		int array[] = new int[] {1,2,3,4,5};
		
		/*
		 * - do-while loops must refer to the elements by index
		 */
		System.out.print("do-while loop\t\t: ");
		do {
			System.out.print(array[index]);
			index++;
		}while (index < array.length);
		index = 0;
		
		/*
		 * - Traditional for loop needs an index indicator, which is i here,
		 * to refer to the elements of the array.
		 */
		System.out.println();
		System.out.print("Traditional for loop\t: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
		/*
		 * - for-each loop only needs a variable to iterate through the array.
		 * 
		 * - The variable, i here, is assigned to the next element of the array
		 * at each iteration. 
		 */
		System.out.println();
		System.out.print("for-each loop\t\t: ");
		for(int i : array) {
			System.out.print(i);
		}
		
		/*
		 * - while loop needs an index indicator, too.
		 */
		System.out.println();
		System.out.print("while loop\t\t: ");
		while (index < array.length) {
			System.out.print(array[index]);
			index++;
		}
	}
}
