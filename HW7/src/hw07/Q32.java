package hw07;

class Rotorcraft {
	protected final int height = 5;
	int fly() {
		return height;
	}
}
public class Q32 extends Rotorcraft {
	private int height = 10; // hiding variable
	protected int fly() {
		return super.height;
	}
	public static void main(String[] unused) {
		Q32 h = new Q32();
		System.out.println(h.fly());
	}
}
// Original code
/*
class Rotorcraft {
	protected final int height = 5;
	//abstract int fly();	// abstract methods cannot be defined by concrete classes.
}
public class Helicopter extends Rotorcraft {
	private int height = 10; // hiding variable
	protected int fly() {
		return super.height;
	}
	public static void main(String[] unused) {
		//- An object cannot be assigned a reference type of its child class. This line will compile but it
		// will throw ClassCastException at runtime.
		Helicopter h = (Helicopter)new Rotorcraft();
		System.out.println(h.fly());
	}
}
*/