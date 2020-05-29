package hw07;

import java.io.*;

class ParentClass{
	protected void dance() throws FileNotFoundException{}
}

public class Q41 extends ParentClass {
	/*
	 * - Overridden methods must be at least as accessible as the parent method.
	 * 
	 * - Overridden methods may not throw a checked exception that is new or broader than the class of 
	 * any exception thrown in the parent method.
	 */
	// void dance() throws IOException{} // invalid due to being less accessible and throwing a broader exception
	// public void dance() throws IOException {} // invalid due to throwing a broader exception
	// private void dance() throws FileNotFoundException {} // invalid due to being less accessible
	public final void dance() {} // valid since marking overridden methods as final is legal.
}
