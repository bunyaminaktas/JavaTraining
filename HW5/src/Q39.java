
public class Q39 {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		String str = new String("Leaves growing");
		do {
			System.out.println(str);
		} while(builder == null);
		
		/* Original loop
		 * - Since the StringBuilder cannot be used in place of a boolean variable
		 * this code does not compile.
		do {
			System.out.println(str);
		} while(builder);
		*/
		System.out.println(builder);
	}
}
