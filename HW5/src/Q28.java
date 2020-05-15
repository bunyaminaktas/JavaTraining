
public class Q28 {
	public static void main(String[] args) {
		String letters = "";
		int count = 0;
		
		/*
		 * - This loop checks if the length of the String variable letters is
		 * equal to 3. Since it is not, the loop adds a String value which has
		 * 2 characters to the letters. And the variable expands continually
		 * at each step by 2. It will never be equal to 3. So the loop never
		 * terminates. It is an infinite loop. 
		 */
		while(letters.length() != 3) {
			letters+="ab";
			if(++count == 50)
				break;
		}
		System.out.println(letters);
		
		// Original loop
		/*
		while(letters.length() != 3) {
			letters+="ab";
		}
		*/
		
	}
}
