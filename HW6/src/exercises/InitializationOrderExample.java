package exercises;

public class InitializationOrderExample {
	static { add(2); }
	static void add(int num) { System.out.print(num + " "); }
	InitializationOrderExample() { add(5); }
	static { add(4); }
	{ add(6); }
	static { new InitializationOrderExample(); }
	// What if we add one more static initializer after this
	static { add(7); }
	{ add(8); }
	public static void main(String[] args) { }
}
