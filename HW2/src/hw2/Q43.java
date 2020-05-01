// Package name had to be changed to hw2
package hw2;

//Class name had to be changed to Q43
public class Q43 {
	public void play() {
		System.out.print("play-");
	}
	public void finalizer() { // Be careful that method's name is finalizer(), not finalize().
		System.out.print("clean-");
	}
	public static void main(String[] fun) {
		Q43 car = new Q43();
		car.play();
		System.gc(); // There is no method named finalize(). So even if this signal triggers JVM GC,
						// there is no method to be called automatically.
		Q43 doll = new Q43();
		doll.play();
	}
}
