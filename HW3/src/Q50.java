// Class name had to be changed to Q50
public class Q50 {
	public static String play(int toy, int age) {
		final String game;
		if(toy<2)
			game = age > 1 ? "1" : "10"; // p1
		else
			game = age > 3 ? "Ball" : "Swim"; //p2		
		return game;
	}
	public static void main(String[] variables) {
		System.out.print(play(5,2));
	}
	
	// This code does not compile because p1 line tries to assign numeric values to a String type variable
	// which is not allowed in Java.
	/* Original code
	public static String play(int toy, int age) {
		final String game;
		if(toy<2)
			game = age > 1 ? 1 : 10; // p1
		else
			game = age > 3 ? "Ball" : "Swim"; //p2		
		return game;
	}
	 */
}
