// Class name had to be changed to Q37
public class Q37 {
	public static int wag = 5;					// g1
	public void Q37(int wag) {					// g2
		this.wag = wag;
	}
	public static void main(String[] tail) {
		System.out.print(new Q37().wag);
		
		// Original statement. new Q37(2) is a call of constructor which does not exist.
		//System.out.print(new Q37(2).wag);		// g3
	}
}
