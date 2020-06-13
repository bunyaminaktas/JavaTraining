package hw09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Q29 {

	public static void main(String[] args) {
		System.out.println(LocalDate.now()); // includes only date
		System.out.println(LocalDateTime.now()); // includes hours, minutes and seconds.
		System.out.println(LocalTime.now()); // includes hours, minutes and seconds.
		
		// There is no class named LocalTimeStamp in Java
		//System.out.println(LocalTimeStamp.now());
	}

}
