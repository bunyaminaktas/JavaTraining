
public class Q36 {
	public static void main(String...strings) {		
		// Even when one operand is true if the other one is also true then ^ evaluates to false 
		// This also negates the option C because both operands are true and ^ evaluates to false
		System.out.println(true^true);
		
		// There is no conditional operator denoted as ^^
		//System.out.println(true^^true);
		
		/*
		 * ^ can be applied to numerics as it will make bitwise comparisons between bits composing the numbers
		 */
		System.out.println(6^7);
	}
}
