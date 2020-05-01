package hw2;

public class Q28 {
	public static void main(String...strings) {
		Integer integer = new Integer(4);
		System.out.print(integer.byteValue());
		
		System.out.print("-");
		
		int i = new Integer(4);
		
		// A method cannot be called on primitives.
		System.out.print(i);
		//System.out.print(i.byteValue());
	}
}
