package hw09;

// Class name has been changed to Consume
public class Q49 {

	public static void main(String[] black) {
		// char values cannot be assigned to String references.
		//String witch = 'b';
		String witch = "b";
		String tail = "lack";
		witch = witch.concat(tail);
		System.out.println(witch);
	}

}
