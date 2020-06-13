package hw09;

public class Q11 {

	public static void main(String[] args) {
		/*
		 * - Since StringBuilder is mutable while creating anotherLine assigning line.append("-"), line itself
		 * is also changed.
		 * 
		 * - So line and anotherLine points to same object. 
		 */
		StringBuilder line = new StringBuilder("-");
		StringBuilder anotherLine = line.append("-");
		System.out.print(line == anotherLine);
		System.out.print(" ");
		System.out.print(line.length());
	}

}
