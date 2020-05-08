// Class name had to be changed to Q42
public class Q42 {
	static int [][] game = new int[6][6];
	//static Object[] obj = game;
	public static void main(String[] args) {
		game[3][3] = 6;
		Object[] obj = game;
		game[3][3] = 3;
		System.out.println(game[3][3]);
		
		// Original code
		/*
		 * - This statement tries to assign a String value to int variable which is not legal.
		 * So the code does not compile with this statement.
		 */
		//game[3][3] = "X";
	}
}
