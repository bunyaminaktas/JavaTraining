package hw09;

import java.util.ArrayList;

public class Q24 {
	/*
	 * - String implements all of the methods used in the method.
	 * - ArrayList does not implement replace() and startsWith() methods.
	 * - StringBuilder does not implement a replace() method with two parameters. 
	 * It has a replace(int,int,String) method.
	 */
	public static void secret ( String mystery) {
		mystery = mystery.replace("1", "8");
		mystery.startsWith("paper");
		String s = mystery.toString();
	}
	
	public static void main(String[] args) {
		
	}

}
