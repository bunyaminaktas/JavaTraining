package hw09;

import java.time.*;
import java.time.format.*;

// Class name has been changed to Q38
public class Q38 {

	public static void main(String[] args) {
		LocalDate newYears = LocalDate.of(2017, 1, 1);
		Period period = Period.ofDays(1);	// period is set to every 1 day.
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");	// date format is determined.
		System.out.print(format.format(newYears.minus(period)));	// prints the previous day of the date in the determined format.
	}

}
