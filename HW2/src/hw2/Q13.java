package hw2;

public class Q13 {
	
	/*
	 * Instance variables and methods can appear anywhere in a class. Constructor is a method, too.
	 */
	
	public String toString() {
		return size + " " + age;
	}
	
	public static void main(String...strings) {
		System.out.println(new Q13(170, 18).toString());
	}
	
	private int size;
	private int age;
	
	public Q13(int size, int age) {
		this.size = size;
		this.age = age;
	}
}

