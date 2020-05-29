package hw07;

import java.io.*;

class School {
	public int getNumberOfStudentsPerClassroom(String... students) throws IOException {
		return 3;
	}
	
	/*
	 * - This method is an overloaded version of the previous method.
	 */
	public int getNumberOfStudentsPerClassroom() throws IOException {
		return 9;
	}
}

// Class name HighSchool changed to Q12
public class Q12 extends School{
	/*
	 * - This method is an overridden version of the second method of the School class
	 * - Since this method throws FileNotFoundException which is a subclass of IOException, this code compiles.
	 */
	public int getNumberOfStudentsPerClassroom() throws FileNotFoundException {
		return 2;
	}
	public static void main(String[] students) throws IOException {
		School school = new Q12();
		System.out.print(school.getNumberOfStudentsPerClassroom());
	}
}
