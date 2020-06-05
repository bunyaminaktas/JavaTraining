package hw8;

// Class name has been changed to Q05
public class Q05 {
	public static void main(String... teams) {
		int score = 1;
		try {
			// Since this variable belongs to try block, it cannot be accessed outside of here
			//int score = 1;
			System.out.print(score++);
		} catch (Throwable t) {
			System.out.print(score++);
		} finally {
			System.out.print(score++);
		}
		System.out.print(score++);
	}
}
