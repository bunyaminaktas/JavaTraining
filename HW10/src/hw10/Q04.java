package hw10;
import java.util.Arrays;

public class Q04 {
	public static void main(String[] args) {
		int[] crossword[] = new int[10][20];
		for(int i = 0; i < crossword.length; i++)
			for(int j = 0; j < crossword.length; j++)
				crossword[i][j] = 'x';
		System.out.println(crossword.length);
		System.out.println(Arrays.toString(crossword[1]));
		// Original code
		// arrays do not have a size() method.
		//System.out.println(crossword.size());
	}
}
