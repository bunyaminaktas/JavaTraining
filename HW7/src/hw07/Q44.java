package hw07;

abstract class House {
	protected abstract Object getSpace();
}
abstract class Room extends House {
	abstract Object getSpace(Object list); // This is a new method since its parameter list is different than the parent class's method.
}

// Class name Ballroom has been changed to Q44
abstract public class Q44 extends House {
	protected abstract Object getSpace(); // defining the parent method again without implementing.
	public static void main(String[] squareFootage) {
		System.out.print("Let's start the party!");
	}
}
