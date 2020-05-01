// Class name had to be changed to Q24
public class Q24 {
	public final static void main(String...strings) {
		int flavors = 30;
		int eaten = 0;
		switch(flavors) {
			case 30: eaten++; // This case statement matches the value of flavors. Since there is no break statement
								// all the remaining statements will be executed.
			case 40: eaten+=2;
			default: eaten--;
		}
		System.out.print(eaten);
	}
}
