// Class name had to be changed to Q04
public class Q04 {
	public int nested() { return nested(2,true); } // g1
	// Original nested() method
	/*
	 * - This method has a return type void which means actually that this method returns nothing.
	 */
	// public void nested() { nested(2,true); } 
	public int nested(int level, boolean height) { return nested(level); }
	/*
	 * - Semicolon at the end of the method block is valid since it is considered a semicolon outside of the 
	 * method which means a null statement.
	 */
	public int nested(int level) { return level+1; };	// g2
	
	public static void main(String[] outOfTheBox) {
		/*
		 * - If we keep nested() method as void, then it will cause since it does not return anything but
		 * print() method expects a return value to print.
		 */
		System.out.print(new Q04().nested());
	}
}
