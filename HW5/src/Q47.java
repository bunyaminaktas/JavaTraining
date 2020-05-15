// Class name had to be changed to Q47
public class Q47 {
	public static void main(String[] args) {
		String tie = null;
		while(tie == null)
			tie = "shoelace";
			System.out.print(tie);
			
		/* Original loop
		 * - Next line has a semicolon at the end which ends the line.
		 * So the while loop enters an infinite iteration since the variable tie
		 * is never updated and returns true.
		 * 
		 * - As a result, while (true); is equivalent to while(true){}		 
		while(tie == null);
			tie = "shoelace";
			System.out.print(tie);
		 */
	}
}
