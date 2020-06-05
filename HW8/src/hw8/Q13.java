package hw8;

public class Q13 {
	public static void main(String [] args) {
		try {
			System.out.print("try ");
		}catch (Exception e) {
			System.out.print("catch ");
		}finally {
			int a = 5 / 0; // finally can throw an exception, too.
			// Since the previous line throws an exception the next line is not executed.
			System.out.print("finally");
		}
	}
}
