// package name had to be changed to hw2
package hw2;

// Class name had to be changed to Q48
public class Q48 {
	public void play() {
		System.out.print("play-");
	}
	public void finalize() {
		System.out.print("clean-");
	}
	public static void main(String[] args) {
		Q43 car = new Q43();
		car.play();
		System.gc(); // If GC is triggered by this method, then it will call finalize() method. 
						// But it may not be triggered.
		Q43 doll = new Q43();
		doll.play();
	}
}
