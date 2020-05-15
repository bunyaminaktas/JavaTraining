
public class Q37 {
	public static void main(String[] args) {
		String race = "";
		
		/*
		 * - Optional labels can be declared in Java
		 * - They are traditionally defined with upper-case letters,
		 * but it is not required.
		 */
		
		/*
		 * - If we remove the lines 20 and 23 (which is lines 25 and 28 in the question)
		 * then the loop would be removed.
		 * 
		 * - Since break statement cannot be used outside of a loop or a switch
		 * the code would not compile any more.
		 */
		loop:
		do {
			race += "x";
			break loop;
		}while(true);
		System.out.println(race);
	}
}
