package hw09;

import java.util.ArrayList;

public class Q43 {
	/*
	 * - ArrayList does not implement any of the methods invoked in this method.
	 * - String does not implement insert() method.
	 * - StringBuilder implements all of the methods used in this method.
	 */
	public static void secret (StringBuilder mystery) {
		char ch = mystery.charAt(3);
		mystery = mystery.insert(1, "more");
		int num = mystery.length();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
