
public class Q11 {
	public static void main(String...strings)
	{
		// As it is seen here, no else statement is required.
		if(true)
			System.out.println("true");
		
		// When the boolean test is false then the target code will not be executed.
		if(false)
			System.out.println("false");

		// if-then statements are not required to cast an object
		int test = 1;
		if(test == 1)
			System.out.println(test);
				
		// if-then statements can run a single statement and block {}
		if(test < 10)
		{
			test = 10;
			System.out.println(test);
		}

	}
}
