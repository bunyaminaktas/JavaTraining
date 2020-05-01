
public class Q19 {
	public static void main(String...strings)
	{
		int time = 11;
		int day = 4;
		
		// numerals cannot be used as boolean expressions in Java as they are in other languages.
		// So this statement will not compile.
		// String dinner = time > 10 ? day ? "Takeout" : "Salad" : "Leftovers";
		
		// But if change the second operand as below it compiles
		String dinner = time > 10 ? true ? "Takeout" : "Salad" : "Leftovers";
		
		// Or like below
		// String dinner = time > 10 ? false ? "Takeout" : "Salad" : "Leftovers";
		System.out.print(dinner);
	}
}
