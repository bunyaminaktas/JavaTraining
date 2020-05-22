package useful;

public class Q19 {
	public static void main(String[] args) {
		/*
		 * - These two calls are valid.
		 */
		useful.MathHelper.roundValue(65.3);
		MathHelper.roundValue(3.1);
		
		//- Since the method is not static imported the class must be specified.
		//roundValue(4.1);
		
		// - : has no use here
		// MathHelper:roundValue(5.92);
	}
}
