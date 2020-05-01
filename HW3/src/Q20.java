// Class name had to be changed to Q20
public class Q20 {
	public static void main(String[] vars) {
		/*
		 * 10 * (2 + (1 + 0) -> 10 * (2 + 1) - > 10 * 3 -> 30
		 */
		int leaders = 10 * (2 + (1 + 2 / 5));
		
		// Original code. Having uneven parentheses, this statement does not compile.
		//int leaders = 10 * (2 + (1 + 2 / 5);
		
		// 30 * 2 -> 60
		int followers = leaders * 2;
		
		// 30 + 60 = 90 is bigger than 10 which will cause the third operand be output.
		System.out.print(leaders + followers < 10 ? "Too few" : "Too many");
	}
}
