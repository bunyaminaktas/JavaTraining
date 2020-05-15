
public class Q40 {
	public static void main(String[] args) {
		int count = 0;
		do {
			// This loop increments the value of count to 2.
			do {
				count++;
			} while (count < 2);
			// Terminates the nearest loop which is the outer one here.
			break;
		} while (true);
		System.out.println(count);
	}
}
