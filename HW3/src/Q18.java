
public class Q18 {
	public static void main(String...strings)
	{
		int dayOfWeek = 5;
		final byte saturday = 6;
		
		// saturday which is taken in a case statement can only be a type which matches or can be promoted to
			// the type of switch variable which is of int type.
			// so saturday can be of byte, short or int.
		switch(dayOfWeek)
		{
		default:
			System.out.print("Another Weekday");
			break;
			
		case saturday:
			System.out.print("Weekend");
		}
	}
}
