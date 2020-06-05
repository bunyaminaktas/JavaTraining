package exercises;


public class ErrorTest {
	static {
		int[] countsOfMoose = new int[3];
		try {
			int num = countsOfMoose[-1];
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("lala");
		}
	}
	public static void doNotCodeThis(int num) {
		doNotCodeThis(1);
	}
	public static void main(String[] args) {
		System.out.println("h");
		doNotCodeThis(1);
	}
}
