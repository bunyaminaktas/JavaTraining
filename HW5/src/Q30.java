import java.util.*;
public class Q30 {
	public static void main(String[] args) {
		int count = 10;
		List<Character> chars = new ArrayList<>();
		/*
		 * - This loop will subtract the size of the list, chars, from 
		 * the variable count. So it will continue as: 
		 * count - size = new count value
		 * 10 - 1 = 9
		 * 9  - 2 = 7
		 * 7  - 3 = 4
		 * 4  - 4 = 0
		 * 
		 * - So at the end the value of count is zero,
		 * the size of the list is 4.
		 */
		do {
			chars.add('a');
			for (Character x : chars) count -= 1;
		} while (count > 0);
		System.out.println(chars.size());
	}
}
