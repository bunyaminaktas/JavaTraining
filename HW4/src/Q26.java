
public class Q26 {
	public static void main(String...strings) {
		char[][] ticTacToe = new char[3][3];					// r1
		ticTacToe[1][2] = 'X';									// r2
		ticTacToe[2][2] = 'X';
		ticTacToe[2][1] = 'X';
		System.out.println(ticTacToe.length + " in a row!");	// r3
		
		// Original code
		/*
		char[][] ticTacToe = new char[3][3];					// r1
		ticTacToe[1][3] = 'X';									// r2
		ticTacToe[2][2] = 'X';
		ticTacToe[3][1] = 'X';
		System.out.println(ticTacToe.length + " in a row!");	// r3
		*/
	}
}
