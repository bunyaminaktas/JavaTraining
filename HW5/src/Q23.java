
public class Q23 {
	public static void main(String[] args) {
		/*
		 * - The diagram in the question simply shows that the loop
		 * will print the lower-case letters once, starting from a to z.
		 * 
		 * - Actually the inner loop has no significance due to that
		 * it is immediately terminated after the first iteration.
		 * 
		 * - So we need a statement that terminates the inner loop but 
		 * not the outer loop.
		 */
		
		/*
		 * - Also labels can be defined in Java to increase readability and
		 * to be able to point to some specific points in Java, such as to loops.
		 */
		
		// break statement will terminate the nearest loop which is numbers here
		letters: for(char ch='a'; ch<='z'; ch++) {
			numbers: for (int n=0; n<=10; n++) {
				System.out.println(ch);
				break;
			}
		}
	
		/*
		 * - When break statement is followed by a label, break will terminate
		 * the statement in where the label points.
		 * 
		 * - In this implementation, numbers points to the inner loop. 
		 * So break will terminate the inner loop. And this is what we want.
		 */
		letters: for(char ch='a'; ch<='z'; ch++) {
			numbers: for (int n=0; n<=10; n++) {
				System.out.println(ch);
				break numbers;
			}
		}
		
		/*
		 * - But in this implementation the label used, letters, points to
		 * the outer loop. So both loops will be iterated once and then terminated.
		 * This means only the first lower-case letter will printed. This is not
		 * what we want.
		 */
		letters: for(char ch='a'; ch<='z'; ch++) {
			numbers: for (int n=0; n<=10; n++) {
				System.out.println(ch);
				break letters;
			}
		}
	}
}
