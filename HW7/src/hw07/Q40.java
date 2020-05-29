package hw07;

class Math {
	public final double secret = 2;
}
class ComplexMath extends Math {
	public final double secret = 4; // hiding variable 
}

// Class name InfiniteMath has been changed to Q40
public class Q40 extends ComplexMath {
	public final double secret = 8; // hiding variable
	public static void main(String[] numbers) {
		Math math = new Q40();
		System.out.print(math.secret); // since variables are hidden math can only access to Math's variable 
										// whose value is 2.0
	}
}
