package hw07;

class Automobile {
	// Since this method is both private and final it cannot be overridden.
	private final String drive() { return "Driving vehicle"; }
}

class Car extends Automobile {
	/*
	 * - This class extends Automobile but cannot access to its method since it is private
	 * 
	 * - So this method is considered as a new method.
	 */
	protected String drive() { return "Driving car"; }
}

//Class name ElectricCat has been changed to Q07
public class Q07 extends Car {
	/*
	 * - This class overrides the method in its parent class and also prevent it from being overridden anymore
	 * by marking it as final
	 */
	public final String drive() { return "Driving electric car"; }
	
	public static void main(String[] wheels) {
		/*
		 * - Although ElectricCar object is referenced by a Car type, the overridden drive() method will be
		 * invoked because the object pointed by the Car reference is an ElectricCar object.
		 */
		final Car car = new Q07();
		System.out.print(car.drive());
	}
}
