package exercises;


abstract interface Universe {
	public static final int MAXIMUM_DEPTH = 2;
	public default void display() {
		
	}
	
	/*
	 * - All (nondefault ?) methods in interfaces are abstract so that they cannot be implemented.
	 */
	public int getMaximumDepth();
	
	/*
	 * - Static interface methods must have a body
	 */
	public static void staticMethod() {
		System.out.println("Printing from static method");
	}
}

/*
 * - Interfaces can be extended only by interfaces.
 * - Interfaces cannot be implemented by interfaces.
 */
abstract interface Galaxy extends Universe{
	public default void display() {
		System.out.println("Printing in a default method.");
	}
	public default int getMaximumDepth() {
		// TODO Auto-generated method stub
		return 0;
	}
	//public abstract void staticMethod();
}
abstract interface Star extends Galaxy{
}

abstract class Planet implements Galaxy{
	/*
	 * - Abstract classes implementing an interface that has a default method, can redeclare that method as abtract
	 * or override it.
	 */
	public abstract void display();
}

/*
 * - Classes can only implement interfaces.
 */

class UniverseTest {
	/*
	 * - Since interface variables are static, they can be accessed without an instance.
	 */
	public int value() {
		return Universe.MAXIMUM_DEPTH;
	}
}

public class InterfaceTest implements Galaxy {
	
	public static void main(String[] arg) {
		new InterfaceTest().getMaximumDepth();
		Universe.staticMethod();
		/*
		 * - Default interface methods needs instances of classes implementing that interface to be invoked.
		 */
		new InterfaceTest().display();
	}
}
