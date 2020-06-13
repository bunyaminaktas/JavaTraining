package hw09;

import java.time.*;
import java.time.format.*;

//Class name has been changed to Q45
public class Q45 {

	public static void main(String[] args) {
		LocalDate newYears = LocalDate.of(2017, 1, 1);
		Period period = Period.ofDays(1);
		/*
		 * - mm represents minutes, MM represents months. LocalDate does not have time fields so that this format
		 * is not applicable to this object.
		 */
		DateTimeFormatter format = DateTimeFormatter.ofPattern("mm-dd-yyyy");
		System.out.print(format.format(newYears.minus(period)));
	}

}
