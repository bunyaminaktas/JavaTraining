package hw2;

// Class name had to be changed to Q37
public class Q37 {
	public String first = "instance";
	public Q37() {
		first = "constructor";
	}
	{ first = "block"; }
	public void print() {
		System.out.println(first);
	}
	
	/*
	 * Order of initialization:
	 * 	-	Instance variables
	 * 	-	Instance initializers
	 * 	-	Constructors
	 * 
	 * So the value of first after the constructor run, is "constructor".
	 */
	public static void main(String...strings) {
		new Q37().print();
	}
}
