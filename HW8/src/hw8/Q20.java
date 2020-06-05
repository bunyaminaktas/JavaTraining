package hw8;

class GasException extends Exception{}
class Element{
	public int getSymbol() throws GasException { return -1; } // g1
}

// Class name Oxygen has been changed to Q20
public class Q20 extends Element {
	// Overrides parent method
	public int getSymbol() throws GasException { return 8; } // g2
	public void printData() {
		try {
			System.out.print(getSymbol());
		} 
		/*
		 * - catch definiton must contain an Exception reference definition to recognize exception thrown
		 * in try block.
		 */
		/*
		catch { // g3
			System.out.print("Unable to read data");
		}*/
		catch(Exception e) {
			System.out.print("Unable to read data");
		}
	}
}
