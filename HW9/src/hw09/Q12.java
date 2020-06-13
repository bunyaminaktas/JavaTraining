package hw09;

import java.util.ArrayList;

public class Q12 {
	/*
	 * - StringBuilder does not implement add() and get() methods.
	 * - ArrayList does not implement length() method. And since its generic type is Object, elements of it
	 * cannot be assigned to String variables.
	 */
	public static void secret( ArrayList mystery ) {
		mystery.add("metal");
		//String str = mystery.get(0);
		//int num = mystery.length();
	}
	
	public static void main(String[] args) {
		
	}

}
