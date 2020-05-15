
public class Q24 {
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
		
		/*
		 * - continue statement ends the current iteration of the nearest
		 * loop and makes the loop begin the next iteration.
		 * 
		 * - But we need to terminate the inner loop totally, not to end just
		 * the current iteration.
		 */
		
		/*
		 * - Since continue only ends the current iteration of 
		 * the nearest loop, it will make the inner loop, which labeled as
		 * numbers, jump to the next iteration, which is what already would
		 * happen even if continue wasn't used.
		 */
		letters: for(char ch='a'; ch<='z'; ch++) {
			numbers: for (int n=0; n<=10; n++) {
				System.out.println(ch);
				continue;
			}
		}
	
		/*
		 * - continue letters; ends the current iteration of the outer loop
		 * which terminates the inner loop automatically, and this is what is 
		 * desired.
		 */
		letters: for(char ch='a'; ch<='z'; ch++) {
			numbers: for (int n=0; n<=10; n++) {
				System.out.println(ch);
				continue letters;
			}
		}
		
		/*
		 * - Since continue numbers; will end the current iteration of
		 * the inner loop due to that the label numbers points to the inner
		 * loop, this implementation does same thing as the first example.
		 * 
		 * - So this does not do what the diagram shows.
		 */
		letters: for(char ch='a'; ch<='z'; ch++) {
			numbers: for (int n=0; n<=10; n++) {
				System.out.println(ch);
				continue numbers;
			}
		}
	}
}
