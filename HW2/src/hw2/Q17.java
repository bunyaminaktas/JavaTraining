package hw2;

import java.util.*;

public class Q17 {
	/*
	 * finalize() method can be called by GC if GC runs.
	 */
	protected void finalize() {
		System.out.println("finalize...");
	}
	public void print() {
		System.out.println("printing...");
	}
	public static void main(String...strings) {
		Q17 q17 = new Q17();
		q17.print();
		System.gc();
		Q17 q172 = new Q17();
		q172.print();
	}
}