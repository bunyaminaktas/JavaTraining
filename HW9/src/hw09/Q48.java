package hw09;

import java.util.ArrayList;
import java.util.List;

public class Q48 {

	public static void main(String[] args) {
		List<String> magazines = new ArrayList();
		magazines.add("Readers Digest");
		magazines.add("People");
		magazines.clear(); // removes all elements.
		magazines.add("The Economist"); // adds 1 element making the size of the list 1.
		magazines.remove(1);	// attempts to remove the second element, which does not exist.
		System.out.println(magazines.size());
	}

}
