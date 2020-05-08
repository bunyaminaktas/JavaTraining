// The class name had to be changed to Q36
public class Q36 {
	public static void main(String... names) {
		// Passed one argument. This statement tries to reach the second element.
		// Since there is no such element, this will cause ArrayIndexOutOfBoundsException.
		System.out.println(names[1]);
	}
}
