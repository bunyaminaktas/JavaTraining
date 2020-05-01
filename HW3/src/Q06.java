
public class Q06 {
	public static void main(String...strings)
	{
		/*
		 * checks if 5 is equal to or is bigger than 5 which will return true,
		 * so it will assign 1+2 to thatNumber
		 */
		long thatNumber = 5>=5 ? 1+2 : 1*1;
		/*
		 * thatNumber is incremented by pre-unary operator and the new value is used
		 * so it equals to 4 which will cause the comparison return false.
		 */
		if(++thatNumber < 4)
			thatNumber += 1;
		
		System.out.println(thatNumber);
	}
}
