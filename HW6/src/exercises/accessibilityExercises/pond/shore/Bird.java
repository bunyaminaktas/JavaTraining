package exercises.accessibilityExercises.pond.shore;

public class Bird {
	private String name = "birdling";
	protected String text = "floating";
	
	void printName() {
		System.out.print(name);
	}
	
	protected void floatInWater() {
		System.out.println(text);
	}
}

class Birdling extends Bird {
	public void walk() {
		Bird b = new Bird();
		//b.printName();
	}
}
