package hw1;

public class Q10 {

	static String weight = "A lot";// is static/class variable.
	/* default */ double ageMonths = 5, ageDays = 2; // are instance variables.
	private static boolean success = true; // is static/class variable.
   
	public static void main(String[] args) {

		/*
		 * A main() method must be public static and void and must have a String type array parameter.
		 * 
		 * It should be static because it needs to be called without creating an object. 
		 * 
		 * So main() method in the example should be corrected.
		 */
		
		final String retries = "1";// is local variable.

		// P1
		System.out.println(weight);// it is accessible from all classes and methods in the same package because it is default.

		Q10 q10 = new Q10();// An object must be created to access instance variables.
		System.out.println(q10.ageMonths);// instance variables can be accessible from other classes or static methods by creating object.
		System.out.println(q10.ageDays);// instance variables can be accessible from other classes or static methods by creating object.

		System.out.println(success);// if it would be in different class, we coudn't access to it because it is private.
		                                // We can access from other classes by creating an object.

		System.out.println(retries);// local variables are not accessible from outside of the method.

	}
	
	
	public void mainOriginal(String[] args) {// Notice in this question that main() is not a static method.
		
		final String retries = "1";// is local variable.
		
		// P1
		System.out.println(weight);// main2 method is non-static and method of Q10 Class itself so we can call
									// static variables and methods inmain2 without name of class.

		System.out.println(ageMonths);// instance variables are accessible because main2 method is non-static and
										// method of Q10 Class itself
		System.out.println(ageDays);// instance variables are accessible because main2 method is non-static and
									// method of Q10 Class itself

		System.out.println(success);// main2 method is non-static and method of Q10 Class itself so we can call
									// static variables and methods in main2 without name of class.

		System.out.println(retries);//  local variables are not accessible from outside of the method.
		// Answer: 2,2,1
	
	}
}
