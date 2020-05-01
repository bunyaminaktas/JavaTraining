// Class name had to be changed to Q12
public class Q12 {
	public static void main(String[] info) {
		int flair = 15;
		if(flair >= 15 && flair < 37) { // flair is between 14-37 so this will return true
			System.out.print("Not enough");
		} if(flair==37) { // flair is not equal to 37 which will cause the code jump to else statement
			System.out.print("Just right");
		} else {
			System.out.print("Too many");
		}
	}
}
