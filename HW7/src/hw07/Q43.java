package hw07;

interface Interface44 {
	// Since interface methods must be able to be overridden they cannot be marked as final
	//final void methodA();
	default void methodB() {}
	static void methodC() {}
	abstract void methodD(); // abstract methods do not have a body.
}

public class Q43 {
	
}
