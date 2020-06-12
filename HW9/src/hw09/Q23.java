package hw09;

import java.util.ArrayList;
import java.util.List;

public class Q23 {

	public static void main(String[] args) {
		List<Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		chars.set(0, 'c');
		chars.remove(0);
	//	System.out.println(chars.length());
		System.out.println(chars.size());

	}

}
