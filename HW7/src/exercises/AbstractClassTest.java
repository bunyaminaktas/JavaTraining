package exercises;

abstract class Animal{
	protected int age = 4;
	public void eat() {
		System.out.println("Animal is eating");
	}
	public abstract String getName();
}

/*
 * - Abstract classes can extend another abstract class in any depth
 */
abstract class Deneme extends Animal{
	/*
	 * - Abstract classes can hide variables.
	 */
	protected int age = 7;
	
	// abstract classes can redeclare abstract methods inherited.
	public abstract void eat();
}
abstract class Deneme2 extends Deneme{
}
abstract class Deneme3 extends Deneme2{
}

class Swan extends Animal {
	public Swan() {
		super(); // abstract classes have constructor
		age = 5;
	}
	public String getName() {
		return "Swan";
	}
}

class Bird extends Animal{
	public String getName() {
		return "Bird";
	}
}

class Flamingo extends Bird{
	/*
	 * - This class does not have to implement getName() method.
	 */
}

class Deneme4 extends Deneme{
	public String getName() {
		return "Deneme4";
	}
	public void eat() {
		
	}
}

public class AbstractClassTest {
	public static void main(String[] args) {
		Animal a = new Swan();
		Swan s = new Swan();
		
		System.out.println(a.getName());
		System.out.println(s.getName());
		System.out.println(a.age);
		System.out.println(s.age);
		
		System.out.println(new Deneme4().age);

	}
}
