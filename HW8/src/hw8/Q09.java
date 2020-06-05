package hw8;

// Class name has been changed to Q09 
public class Q09 {
	public static void main(String officials[]) {
		try {
			System.out.print('A');
			throw new RuntimeException("Out of bounds!");
		}catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.print('B');
			
			// There is no variable or object defined and named t. So this line causes compilation error.
			//throw t;
		}finally {
			System.out.println('C');
		}
		System.out.println();
	}
}
