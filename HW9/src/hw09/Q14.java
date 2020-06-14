package hw09;

import java.util.*;

public class Q14 {
	public static void main(String[] args) {
		List<Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		chars.set(1,'c');	// sets second element to 'c'
		chars.remove(0);	// removes the first element making the size of chars 1.
		System.out.print(chars.size() + " " + chars.contains('b'));
	}
}
