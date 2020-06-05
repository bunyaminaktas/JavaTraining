package hw8;
class BigCat{
	//Original code
		/*
		 * - throw keyword is used to throw exceptions inside a method not in method signatures. 
		 * This code does not compile.
		 * 
		 * - To declare an exception "throws" must be used in method signature.
		 */
		/*
		void roar(int level) throw RuntimeException {	// m1
			if(level<3) throw new IllegalArgumentException("Incomplete");
			System.out.print("Roar!");
		}
		*/
	void roar(int level) throws RuntimeException {	// m1
		if(level<3) throw new IllegalArgumentException("Incomplete");
		System.out.print("Roar!");
	}	
}

// Class name Lion has been changed to Q32
public class Q32 extends BigCat{
	public void roar() {
		System.out.print("Roar!!!");
	}
	public static void main(String[] cubs) {
		final BigCat kitty = new Q32();
		kitty.roar(2);
	}
}
