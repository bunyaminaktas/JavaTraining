package hw09;

import java.util.ArrayList;
import java.util.List;

public class Q42 {

	public static void main(String[] args) {
		List<Integer> pennies = new ArrayList<>();
		pennies.add(3);
		pennies.add(2);
		pennies.add(1);
		pennies.remove(2); // removes the element in the index 2, which is 1.
		System.out.println(pennies);
	}

}
