
public class Q44 {
	public static void main(String...strings)
	{
		int characters = 5;
		int story = 3;
		/*
		 * - characters are bigger than 4, so it jumps to third operand
		 * - Third operand is also a ternary operator which checks the value of story
		 * story's value is bigger than 1, so it jumps to second operand which is 2
		 * - Data type of 2 is integral but it will be transformed to floating point type automaticlly by Java
		 */
		double movieRating = characters <= 4 ? 3 : story>1 ? 2 : 1;
		
		System.out.print(movieRating);
	}
}
