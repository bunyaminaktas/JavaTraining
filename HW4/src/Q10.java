import java.util.Arrays;

public class Q10 {
	public static void main(String...strings) {
		String[] nums = new String[] {"1", "9", "10" };
		Arrays.parallelSort(nums);	// sorts nums in alphabetical order because the nums consists String elements.
		
		// Arrays.toString() prints arrays neatly.
		System.out.println(Arrays.toString(nums));
	}
}
