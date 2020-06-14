package hw09;

// Class name has been changed to Q41
public class Q41 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("54321");
		builder.substring(2);	// returns a String object so that the value of builder does not change.
		System.out.println(builder.charAt(1));
	}

}
