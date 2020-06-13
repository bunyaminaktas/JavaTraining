package hw09;

import java.time.LocalDate;

public class Q50 {

	public static void main(String[] args) {
		LocalDate xmas = LocalDate.of(2016,  12, 25);
		
		// LocalDate is immutable. Immutable classes do not have setter methods.
		//xmas.setYear(2017);
		System.out.println(xmas.getYear());
	}

}
