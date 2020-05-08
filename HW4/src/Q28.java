// Class name had to be changed to Q28
public class Q28 {
	static int [][] game = new int[6][6];
	//static Object[] obj = game;
	public static void main(String[] args) {
		game[3][3] = 6;
		Object[] obj = game;
		
		/*
		 * - This line attempts to assign a String value to int[] which is not legal actually but,
		 * since Object can hold all objects Java thinks that this assignment is legal and compiles the code.
		 */
		
		obj[3] = "X";
		System.out.println(game[3][3]);
	}
}
