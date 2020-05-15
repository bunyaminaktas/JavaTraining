
public class Q46 {
	public static void main(String[] args) {
		/*
		 * - We define the a count variable outside of all the loops 
		 * in order to be able to count the iterations of loops.
		 */
		
		int count = 0;
		for(int k=0; k<5;k++) {count++;}
		System.out.println("Option A iterated " + count + " times");
		
		count = 0;
		for(int k=1; k<=5;k++) {count++;}
		System.out.println("Option B iterated " + count + " times");
		
		/*
		 * - do-while loop iterates 6 times differently than others because
		 * this loop executes first the body and then evaluates the boolean 
		 * segment as opposed to the other loop.
		 */
		count = 0;
		int k=0;
		do { count++; } while(k++<5);
		System.out.println("Option C iterated " + count + " times");
		
		count = 0;
		k=0;
		while(k++<5) {count++;}
		System.out.println("Option D iterated " + count + " times");
	}
}
