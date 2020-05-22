package employee;

import static commerce.Bank.*; // Since Bank has no static members this line imports nothing.

public class Teller {
	public void processAccount(int depositSlip, int withdrawalSlip) {
		/*
		 * - Since these methods are not present in the current class and are not imported
		 * these statements are incorrect.
		 */
		//withdrawal(withdrawalSlip);
		//deposit(depositSlip);
	}
}
