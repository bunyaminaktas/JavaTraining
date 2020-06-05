package hw8;
abstract class Duck{
	protected int count; // default to zero
	public abstract int getDuckies();
}

// Class name Ducklings has been changed to Q30
public class Q30 extends Duck {
	private int age;
	public Q30(int age) { this.age = age; }
	// Since value of count is not changed, this method throws ArithmeticException at runtime.
	public int getDuckies() { return this.age/count;}
	public static void main(String[] pondInfo) {
		Duck itQuacks = new Q30(5);
		System.out.print(itQuacks.getDuckies());
	}
}
