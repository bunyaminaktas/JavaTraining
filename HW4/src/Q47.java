import java.util.Arrays;

public class Q47 {
	public static void main(String...strings) {
		// This is a sorted array so that it is okay for binary searches.
		String[] os = new String[] { "Linux", "Mac", "Windows" };
		System.out.println(Arrays.binarySearch(os, "Linux"));
	}
}
