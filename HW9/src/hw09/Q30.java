package hw09;

// Class name has been changed to Q30
public class Q30 {

	public static void main(String[] args) {
		String builder = "54321";
		builder = builder.substring(4); // builder becomes "1".
		System.out.println(builder.charAt(2)); // builder does not have three elements so this line throws StringIndexOutOfBoundsException.
	}

}
