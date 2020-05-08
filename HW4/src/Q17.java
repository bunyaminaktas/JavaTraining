import java.util.Arrays;

public class Q17 {
	public static void main(String...strings) {
		String[] os = new String[] {"Mac", "Linux", "Windows"};
		Arrays.sort(os); // sorted alphabetically.
		System.out.println(Arrays.binarySearch(os, "Mac")); // Mac resides in second place which is indexed 1.
	}
}
