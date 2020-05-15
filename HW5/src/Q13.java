import java.util.Arrays;
import java.util.List;

public class Q13 {
	public static void main(String[] args) {
		/*
		 * - Array.asList has a varargs parameter
		 * - varargs takes arrays as argument or takes individual variables as
		 * argument and converts them into array.
		 * 
		 * - Finally Arrays.asList() converts this array into a List
		 */
		List<String> bottles = Arrays.asList("glass", "plastic");
		
		/*
		 * - The loop is missing the last segment which is update statement.
		 * So, normally this loop is an infinite loop since the variable checked,
		 * is never updated.
		 * 
		 * - But the loop has break statement which will terminate the loop immediately,
		 * after the first iteration.
		 */
		for(int type = 0; type < bottles.size();) {
			System.out.print(bottles.get(type) + ",");
			break;
		}
		System.out.print("end");
	}
}
