package hw1;

// Class name is changed to Q33 due to that it must be same with file name.
public class Q33 {
	static int start = 2;
	final int end;
	// Constructor name must be same with class name.
	public Q33(int x) {
		x = 4;
		end = x;
	}
	public void fly(int distance) {
		System.out.print(end-start+" ");
		System.out.print(distance);
	}
	public static void main(String... start) {
		new Q33(10).fly(5);
	}
}
