// Class name had to be changed to Q08
public class Q08 {
	// This does not compile since Java is case-sensitive and public access modifier must begin with lower p.
	// Public int compute1 () { return 10; }
	
	/*
	 * - This does not compile, too, because the int value 10, cannot be autoboxed to Long wrapper class.
	 */
	// Long compute2() { return 10; }
	
	// void methods cannot return a value.
	//void compute3() { return 10; }
	
	// This method's return type is String. It cannot return an int value.
	//private String compute4() { return 10; }
}
