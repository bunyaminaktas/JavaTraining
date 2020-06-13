package hw09;

import java.util.function.Predicate;

public class Q31 {

	public static void main(String[] args) {
		/*
		 * - If brackets are to be used, then the statement must have return keyword at the beginning and 
		 * semicolon at the end.
		 */
		
		Predicate<Integer> ip = i -> i != 0;
		//Predicate<Integer> ipA = i -> { i != 0 };			// missing return and ;
		//Predicate<Integer> ipB = i -> { i != 0; };		// missing return
		//Predicate<Integer> ipC = i -> { return i != 0 };	// missing ;
		Predicate<Integer> ipD = i -> {return i != 0; };
	}

}
