
public class Q03 {	
	public static void main(String...strings)
	{
		int[] lowercase = new int[0];
		Integer[] uppercase = new Integer[0];
		
		// int[] can be cast to Object type reference variables.
		Object l = lowercase;
		Object u = uppercase;
		System.out.print(lowercase + " " + l);
		System.out.print(u);
	}	
}
