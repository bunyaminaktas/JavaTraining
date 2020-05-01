
public class Q02 {
	public static void main(String...strings)
	{
		int meal = 5;
		int tip = 2;
		/*
		 * - Next statement has a tenary operator which checks if the first operand, boolean expression,
		 * is true and if it is, executes the second operand if not, the third operand.
		 * 
		 * - In this example it will execute the third operand because meal is not bigger than 6.
		 */
		int total = meal + (meal > 6 ? ++tip : --tip);
		System.out.println("Total : " + total + "\n" + "Tip : " + tip);
	}
}
