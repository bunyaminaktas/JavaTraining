package hw09;

// Class name Shoot has been changed to Q17
public class Q17 {
	interface Target {	// a functional interface since it has only one method and that method returns a boolean value
		boolean needToAim(double angle);
	}
	static void prepare(double angle, Target t) {
		boolean ready = t.needToAim(angle);	// k1
		System.out.println(ready);
	}
	public static void main(String[] args) {
		// lambda expression returns true if d is bigger than 5 or less than -5
		prepare(45, d -> d > 5 || d < -5);	// k2
	}

}
