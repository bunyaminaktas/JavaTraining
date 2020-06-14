package hw09;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * - Method chaining is allowed in Java that methods can be called in one line and also with
		 * calling the constructor.
		 */
		System.out.println(new StringBuilder().append("clown"));
		System.out.println(new StringBuilder("clown"));
		System.out.println(new StringBuilder("cl").insert(2, "own"));
	}

}
