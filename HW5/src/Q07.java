
public class Q07 {
	public static void main(String[] args) {
		int counter = 0;
		
		// Traditional for loop takes three segments 
		for(counter = 0; counter < 2; counter++) {
			counter++;
		}
		
		// do-while loop only takes one segment
		do {
			counter = 0;
		} while (counter > 0);
		
		// for-each loop takes two segments
		int array[] = new int[2];
		for(int i : array) {
			System.out.println(i);
		}
		
		// while loop takes one segment
		while(counter < 2) {
			counter++;
		}
	}
}
