// Class name had to be changed to Q40
public class Q40 {
	public static void main(String[] arguments) {
		int turtle = 10 * (2 + (3 + 2) / 5); // Evaluates to 30
		int hare = turtle < 5 ? 10 : 25; // Evaluates to 25
		
		// Since turtle is not less than hare, third operand will be evaluated.
		System.out.print(turtle < hare ? "Hare wins!" : "Turtle wins!");
	}
}
