package hw09;

public class Q39 {

	public static void main(String[] args) {
		String happy = " :) - (: ";
		
		/*
		 * - trim() method removes white spaces, tabs, and new line characters from the beginning and from the end.
		 */
		String really = happy.trim();
		
		/*
		 * - substring() method returns the part of the string starting from the former index and stopping at 
		 * the latter index. The former index is included.
		 */
		String questionA = happy.substring(0, happy.length() - 1); 	// " :) - (:"
		String questionB = happy.substring(0, happy.length()); 		// " :) - (: "
		String questionC = happy.substring(1, happy.length() - 1); 	// ":) - (:"
		String questionD = happy.substring(1, happy.length()); 		// ":) - (: "
		System.out.println(really);
		System.out.println("A - " + really.equals(questionA));
		System.out.println("B - " + really.equals(questionB));
		System.out.println("C - " + really.equals(questionC));
		System.out.println("D - " + really.equals(questionD));
	}

}
