package hw09;

import java.util.List;
import java.util.Arrays;

public class Q21 {

	public static void main(String[] args) {
		String[] array = {"Natural History", "Science"};
		List<String> museums = Arrays.asList(array); // converts String[] to List.
		museums.set(0, "Art"); // changes the first value of the list.
		System.out.println(museums.contains("Art"));
	}

}
