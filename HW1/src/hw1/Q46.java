package hw1; // package name must be hw1 in this example.
//Class name is changed to Q46 due to that it must be same with file name.
public class Q46 {
	String color = "red"; // Instance variable
	
	/*
	 * This method prints "purple" no matter what it takes  as argument
	 */
	private void printColor(String color) {
		color ="purple";
		System.out.print(color);
	}
	public static void main(String[] rider) {
		new Q46().printColor("blue"); // "blue" value is not important. printColor will print "purple" anyways.
	}
}
