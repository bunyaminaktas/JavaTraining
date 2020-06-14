package hw09;

import java.util.*;

public class Q08 {

	public static void main(String[] args) {
		List<String> museums = new ArrayList<>(1);
		museums.add("Natural History");
		museums.add("Science");
		museums.add("Art");
		museums.remove(2);	// removes the third element which is "Art".
		System.out.println(museums);
	}

}
