package exercises;
/*
 * - Since multiple abstract classes cannot be extended at same time, there is no method confliction similar to
 * the interfaces.
 */
abstract class Plane{
	public abstract int getNumber();
}

abstract class Car extends Plane{
	public abstract int getNumber();
}

public class AbstractClassConflictedMethods extends Car {
	public int getNumber() {
		return 2;
	}
}
