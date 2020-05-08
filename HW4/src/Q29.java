import java.util.Arrays;

public class Q29 {
	public static void main(String...strings) {
		String[] os = new String[] {"Mac", "Linux", "Windows" };
		Arrays.sort(os);
		
		/* 
		 * - This binary search will find the possible index number for non-existent "RedHat" as 2, 
		 * negates it to -2 then subtract 1 and returns that value which is -3.
		 */
		System.out.println(Arrays.binarySearch(os, "RedHat"));
	}
}
