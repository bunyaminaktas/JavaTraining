// package name had to be changed to hw2
package hw2;

// Class name had to be changed to Q50
public class Q50 {
	public Q50() {
		System.out.print("a");
	}
	public void Q50() {
		System.out.print("b");
	}
	public void run() {
		new Q50();
		Q50();
	}
	public static void main(String... args) {
		new Q50().run(); // Calling constructor at first.
							// Then calling run() method calling constructor and then Q50() method.
	}
}
