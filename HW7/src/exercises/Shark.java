package exercises;

class Fish{
	protected int size;
	private int age;
	public Fish(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	private String show() {
		return "Fish";
	}
}

public class Shark extends Fish {
	private int numberOfFins = 8;
	public Shark(int age) {
		super(age);
		this.size = 4;
	}
	public void displaySharkDetails() {
		System.out.print("Shark with age: "+getAge());
		System.out.print(" and "+super.size+" meters long");
		System.out.print(" with "+this.numberOfFins+" fins");
	}
	private String show() {
		return "Shark";
	}
	
	// Testing inheritance
	public static void main(String[] args) {
		Fish f = new Fish(3);
		Shark s = new Shark(5);
		
		System.out.println(f.getAge());
		System.out.println(s.getAge());
		
		System.out.println(f.size);
		System.out.println(s.size);
		
		s.displaySharkDetails();
		System.out.println("\n"+s.show());
	}
}
