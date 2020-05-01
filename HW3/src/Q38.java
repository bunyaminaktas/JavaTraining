// Class name had to be changed to Q38
public class Q38 {
	public static void main(String[] args) {
		int colorOfRainbow = 10;
		final int red = 5;	// This variable must be final to be able to be used in case statements.
		
		switch(colorOfRainbow) {
			default:
				System.out.print("Home");
				break;
			case red:
				System.out.print("Away");
		}
	}
}
