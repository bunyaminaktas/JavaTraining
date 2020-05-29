package hw07;

abstract class AbstractClass {
	/*
	 * - final keyword cannot be applied to abstract methods since it prevent methods from being overridden
	 * and abstract methods' reason of existence is to be overridden.
	 * 
	 * - private modifier cannot also be applied to abstract methods since they must be accessible from subclasses
	 * to be able to be overridden.
	 * 
	 * - Abstract classes do not have default modifier.
	 * 
	 * - Interfaces do have default but those methods that have default modifier is not abstract
	 */

	// Abstract methods end with a semicolon, they do not have any body.
	
	//final abstract void methodA();
	//private abstract void methodB();
	//default abstract void methodC();
	
	protected abstract void methodD();
	
}

public class Q23 {

}
