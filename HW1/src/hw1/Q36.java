package hw1;

public class Q36 {
	public static void main(String... arguments) {} // Valid
	public static void main(String arguments) {} // Not recognised as a main() method. JVM would see this like a normal method.
	//public static final void main(String [] arguments) {} // Valid
	//public static void main(String [] arguments) {} // Valid
}
