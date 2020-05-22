
public class Q02 {
	public Q02() {
		/*
		 * - Java will look at the parameter list, choose the closest constructor and run it.
		 */
		this("Hello World");
	}
	public Q02(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		/*
		 * - When new keyword is used with constructor name of a class, it calls the constructor and creates
		 * a new object of that class.
		 */
		new Q02();
	}
}
