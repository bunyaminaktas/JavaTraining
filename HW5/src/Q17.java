
public class Q17 {
	public static void main(String[] args) {
		do {
			int count = 0;
			do {
				count++;
			}while (count < 2);
				break;
		}while(true);
		// Since count is a local variable belonging to the do-while loop
			// it cannot be reached.
		//System.out.println(count);
	}
}
