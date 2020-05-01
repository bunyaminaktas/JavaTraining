
public class Q13 
{
	public static void main(String...strings)
	{
		int number = 5;
		final int number2 = 5;
		
		switch (number) 
		{
		// case statements may not have a break statement and also they have a final variable
		case number2:
			System.out.println(5);
			
		// unless the variable is final, case statements can only have constant values.
		case 4:
			System.out.println("not true");
			break;
		
		// not allowed because it does not match the switch variable data type.
		// case "5":
			//break;
		}
		
		int num = 5;
		final long num2 = 6;
		
		switch(num)
		{
		
		// case statement cannot take a wider variable than the switch variable
		/*
		case num2:
			break;
		*/
		}
	}
}
