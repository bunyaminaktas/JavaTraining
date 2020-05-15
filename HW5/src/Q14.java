
public class Q14 {
	public static void main(String[] args) {
		String letters = "";	// Variable has no characters.
		while(letters.length() != 2) // checks if the length of the characters of the variable is not equal to 2.
			letters+="a"; // If not, a character will be added.
		System.out.println(letters);
	}
}
