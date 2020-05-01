
// Class name had to be changed to Q04
public class Q04 {
	public static void main(String[] input) {
		int plan = 1;
		// plan++ will increment the value by 1 but output the previous value
		// --plan will decrement the value by 1 and output the new value
		plan = plan++ + --plan;
		
		if(plan==1) {
			System.out.print("Plan A");
		} else if (plan==2) {  System.out.print("Plan B");
		} else System.out.print("Plan C");
		
		/*
		 * This way the code will not compile. One of the else blocks has to be eliminated.
		 */
		/*
		if(plan==1) {
			System.out.print("Plan A");
		} else { if(plan==2) System.out.print("Plan B");
		} else System.out.print("Plan C");
		*/
	}
}
