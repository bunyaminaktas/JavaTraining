package hw1;

//Class name is changed to Q45 due to that it must be same with file name.
public class Q45 {
	static int wheels = 1;
	int tracks = 5;
	public static void main(String[] arguments) {
		Q45 q45 = new Q45();
		int feet = 4, tracks = 15;
		System.out.print(feet + tracks + q45.wheels); //static variables should be accessed in a static way
														// but still it can be read in a non-static way.
	}
}
