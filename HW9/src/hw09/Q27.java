package hw09;

public class Q27 {
	public static void main(String[] args) {
		String line = new String("-");
		/*
		 * - concat() method creates a new Object with the value "--" and assigns it to anotherLine
		 * - As a result, line is "-" and anotherLine is "--"
		 */
		String anotherLine = line.concat("-");
		System.out.print(line == anotherLine);
		System.out.print(" ");
		System.out.print(line.length());
	}
}
