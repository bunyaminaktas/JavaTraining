package hw09;

import java.time.Period;

public class Q37 {

	public static void main(String[] args) {
		/*
		 * - ofWeeks() and ofDays() are static methods so that they cannot be chained. 
		 * period1 is 3 days at the end.
		 */
		Period period1 = Period.ofWeeks(1).ofDays(3);
		Period period2 = Period.ofDays(10);
	}

}
