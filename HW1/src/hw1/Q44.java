package hw1;

//Class name is changed to Q44 due to that it must be same with file name.
public class Q44 {
	private boolean numLock = true;
	static boolean capLock = false;
	public static void main(String... shortcuts) {
		Q44 q44 = new Q44();
		System.out.print(q44.numLock+" "+capLock); // numLock cannot be accessed without creating an object, in a static way.
	}
}

/*
public class Keyboard {
	private boolean numLock = true;
	static boolean capLock = false;
	public static void main(String... shortcuts) {
		System.out.print(numLock+" "+capLock); // numLock cannot be accessed without creating an object, in a static way.
	}
}
*/