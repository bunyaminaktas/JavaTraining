package hw09;

import java.util.function.Predicate;

public class Q34 {

	public static void main(String[] args) {
		/*
		 * - This Predicate's generic type is Object and Object class has equals() method.
		 */
		Predicate clear = c -> c.equals("clear");
		System.out.println(clear.test("pink"));
	}

}
