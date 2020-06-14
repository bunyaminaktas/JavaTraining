package hw09;

import java.util.function.*;

// Class name has been changed to Q26
public class Q26 {

	public static void main(String[] s) {
		/*
		 * Lambda expression expects a String argument since Predicate is defined as String.
		 */
		// Predicate<String> pred1 = (Integer i) -> true;
		// Predicate<String> pred2 = (Object 0) -> true;
		
		// This line is correct but since the variable name is used as main() method's parameter name, it does not compile.
		//Predicate<String> pred3 = (String s) -> true; 
		
		Predicate<String> pred3 = (String s1) -> true; 
	}

}
