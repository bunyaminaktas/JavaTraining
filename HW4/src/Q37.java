
public class Q37 {
	public static void main(String...strings) {
		/*
		 * The code does not have any errors. So it will compile and run well.
		 */
		
		char[][] ticTacToe = new char[3][3];					// r1
		ticTacToe[0][0] = 'X';									// r2
		ticTacToe[1][1] = 'X';
		ticTacToe[2][2] = 'X';
		System.out.println(ticTacToe.length + " in a row!");	// r3
	}
}
