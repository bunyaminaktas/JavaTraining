import java.util.Arrays;

public class Q41 {
	public static void main(String...strings) {
		/*
		 * - Binary search algorithm looks firstly at the middle element of the array.
		 * Since the middle element matches the searched value, it will return the index of the middle element.
		 * 
		 * But if we change the order of the array then it could not find the value.
		 */
		String[] os = new String[] { "Mac", "Linux", "Windows" };
		System.out.println(Arrays.binarySearch(os, "Linux"));
		
		os[0] = "Windows";
		os[1] = "Mac";
		os[2] = "Linux";
		System.out.println(Arrays.binarySearch(os, "Linux"));
	}
}
