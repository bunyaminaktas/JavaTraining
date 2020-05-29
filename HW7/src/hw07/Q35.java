package hw07;

interface CanFly {
	// Non-default interface methods cannot have a body.
	public void fly();
}
class Bird { // final modifier prevents this class from being extended.
	// The method must return a value.
	public int fly(int speed) {return speed;}
}

// Class name Eagle has been changed to Q35
public class Q35 extends Bird implements CanFly{
	public void fly() {}
}
// Original code
/*
interface CanFly {
	// Non-default interface methods cannot have a body.
	public void fly() {}
}
final class Bird { // final modifier prevents this class from being extended.
	// The method must return a value.
	public int fly(int speed) {}
}

// Class name Eagle has been changed to Q35
public class Q35 extends Bird implements CanFly{
	public void fly() {}
}
*/