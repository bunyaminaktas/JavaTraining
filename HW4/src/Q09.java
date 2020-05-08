import java.util.Arrays;

public class Q09 {
	public static void main(String...strings) {
		/*
		 * - Particular elements can be searched in an array, if the array is sorted, using the method
		 * Arrays.binarySearch(), which is in java.util library.
		 * 
		 * - If the search will be performed in an unsorted array then the result cannot be predicted.
		 */
		
		int [] nums = {1,2,3};
		System.out.println(Arrays.binarySearch(nums,1));
		System.out.println(Arrays.binarySearch(nums,3));
		System.out.println(Arrays.binarySearch(nums,5));
		
		
		/*
		 * - Arrays can be sorted using Arrays.sort() method that is in java.util library.
		 */
		String [] numbers = {"100","10","9"};
		Arrays.parallelSort(numbers);		
		System.out.println(Arrays.binarySearch(numbers,"10"));
		
		String [] numbers2 = {"100","10","9", "Hello"};
		
		// Because numbers2 is not sorted the result could be wrong.
		System.out.println(Arrays.binarySearch(numbers2,"100"));
	}
}
