
public class Q41 {
	public static void main(String[] args) {
		/*
		 * - In order to prevent this nested loop runs forever,
		 * we must terminate the outest loop which is labeled with t.
		 * 
		 * - If the optional labels are used with break statement,
		 * the break statement terminates the loop pointed with that label.
		 * 
		 * - If no label is used with break statement, then the break terminates
		 * the nearest loop.
		 */
		
		t: while (true) {
			f: while (true) {
				break t;
			}
		}
	}
}
