package hw1;

public class Q1 {
	/*
	 * - The method is public, has static keyword and a parameter which is a String array. 
	 * 
	 * - In addition, it has final keyword that prevents methods be overridden. 
	 * 
	 * - Overriding main() method is allowed in Java and sometimes it is necessary to prevent 
	 * main() method to be overridden. For example if a class is extended, 
	 * then main() method can be overridden in subclasses and this may not be desired. 
	 * 
	 * - In conclusion,  the method in this option can be compiled and run without an error.
	 */
	public static final void main(String [] mydata) {}
	
	
	/*
	 * - main() method should be called without creating an object. 
	 * 
	 * - In order to call a method without creating an object, it should be made static. 
	 * 
	 * - A method can be made static by using static keyword. 
	 * 
	 * - So Java gives an error if the main() method does not contain static keyword
	 * in its signature as in this example.
	 */
	// public void main(String[] args) {}
	
	
	/*
	 * - Java Virtual Machine (JVM) always looks for a main() method 
	 * that does contain a String array parameter. 
	 * 
	 * - Because this option does not contain any parameters,
	 * JVM cannot recognize the main() method and gives an error.
	 */
	// public static void main() {}
	
	
	/*
	 * - JVM looks for the main() signature because it is predefined that way. 
	 * 
	 * - So the main method should contain main() in its signature. 
	 * 
	 * - Other than that, main() method should be public 
	 * because it should be able to get called by JVM which is outside of the scope of the package. 
	 * 
	 * - The method has a parameter that is a String type array as it should be. 
	 * The name of the array is not significant for the validity of main() method. 
	 * 
	 * - In this option, JVM cannot find the main() method due to that 
	 * the method is not public at the first place and gives an error.
	 */
	/* private static void start(String[] mydata) {} */
}
