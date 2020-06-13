package hw09;

// Class name Shoot has been changed to Q17
public class Q17 {
	interface Target {
		boolean needToAim(double angle);
	}
	static void prepare(double angle, Target t) {
		boolean ready = t.needToAim(angle);	// k1
		System.out.println(ready);
	}
	public static void main(String[] args) {
		prepare(45, d -> d > 5 || d < -5);	// k2
	}

}
