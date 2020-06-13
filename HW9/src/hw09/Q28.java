package hw09;

import java.util.function.Predicate;

public class Q28 {

	public static void main(String[] args) {
		// Original code
		/*
		 * - Since no generic type is stated, it defaults to Object which does not implement a method named
		 * startsWith(), so that this line does not compile.
		 * 
		 * - String generic type may be used to compile this code.
		 */
		//Predicate dash = c -> c.startsWith("-");
		Predicate<String> dash = c -> c.startsWith("-");
		System.out.println(dash.test("-"));

	}

}
