package hw07;

/*
 * - Method overriding rules:
 * 	1 - Two methods must have the same signature. Methods in this code comply to this rule.
 * 	2 - Overridden method must be at least as accessible as the parent method. In this code the overridden method's
 * accessibility is less than the parent method. This is first problem.
 * 
 * 	3 - Overridden method cannot throw any new or broader exception. These methods comply to this rule.
 * 
 *  4 - Two methods' return types must be covariant. But here the first method's return type is void but the
 * overridden method's return type is Object, this is the second problem.
 * 
 * 	First method is declared final which prevents methods from being overridden. This the third problem.
 */

class Television {
	
	protected void watch() {}
	
	// Original code
	/*
	protected final void watch() {}
	*/
}

// Class name had to be changed to Q09
public class Q09 extends Television {
	
	public void watch() {}
	
	//Original code
	/*
	Object watch() {}
	*/
}
