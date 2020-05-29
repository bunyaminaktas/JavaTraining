package hw07;

// Car has been named Car2 since Q07 has the same class.
abstract class Car2 {
	static { System.out.print("1");	}
	public Car2(String name) {
		super();
		System.out.print("2");
	}
	{ System.out.print("3"); }
}

// Class name BlueCar has been changed to Q27
public class Q27 extends Car2 {
	{ System.out.print("4"); }
	public Q27() {
		super("blue");
		System.out.print("5");
	}
	public static void main(String[] gears) {
		/*
		 * - Firstly the super class will be instantiated in order static initializer, instance initializer and constructor
		 * which will print 132 respectively.
		 * 
		 * - Then the current class will be instantiated in same order which prints 45.
		 */
		new Q27();
	}
}
