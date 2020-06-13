package hw09;

public class Q46 {

	public static void main(String[] args) {
		/*
		 * - replace() method has two signatures as follows:
		 * 		String replace(char oldChar, char newChar),
		 * 		String replace(CharSequence oldChar, CharSequence newChar).
		 * 
		 * - CharSequence is an interface and both String and StringBuilder implements this interface 
		 * which means both can be used in replace() method.
		 */
		System.out.println("abcabc".replace('a', 'A'));
		System.out.println("abcabc".replace(new String("a"), new String("A")));
		System.out.println("abcabc".replace(new StringBuilder("a"), new StringBuilder("A")));
	}

}
