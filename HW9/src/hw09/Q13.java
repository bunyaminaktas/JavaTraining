package hw09;

import java.util.function.Predicate;

public class Q13 {

	public static void main(String[] args) {
		/*
		 * - These are valid lambda expression syntaxes
		 */
		Predicate<StringBuilder> p1 = (StringBuilder b) -> {return true;};
		Predicate<StringBuilder> p2 = (StringBuilder b) -> {return true; };
		Predicate<StringBuilder> p3 = (b)  -> {return true;};
		Predicate<StringBuilder> p4 = b -> {return true;};
		Predicate<StringBuilder> p5 = (b)  -> true;
		Predicate<StringBuilder> p6 = (StringBuilder b) -> true;
	}

}
