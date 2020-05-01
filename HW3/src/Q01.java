import java.awt.Checkbox;

/*
 * switch statement exercises
 */

public class Q01 {
	public static void main(String...strings) {
		final int num = 10;
		int num2 = 5;
		// num = 10; // When final variable is initialized later, it cannot be used in case statements.  
		
		switch(num2)
		{
		case 3:
			System.out.println("3");
			break;
			
		case num:
			System.out.println(num);
			break;
			
		default:
			System.out.println("Nothing found");				
		}
		
	}
	
	/*
	 * Some tests to use final parameters in a switch statement
	 */
	private boolean checkNumber(int number1, final int number2) 
	{
		// Unsuccessful. Switch statement never accepts a variable which takes its value through a parameter.
		final Integer check = number2;
		switch(number1)
		{
		case 5:
			return true;
		}
		return false;
	}
}
