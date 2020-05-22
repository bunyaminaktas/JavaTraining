
public class Q18 {
	public static void method(int[] array, String str, long l, boolean b) {
		/*
		 * - Since array is an array object and the reference to the array is copied to this method,
		 * modification through that copy reference will affect the original object.
		 * 
		 * - But others are only primitives so that the values passed into this method are copy.
		 * The original values will not be affected.
		 */
		
		array[0] = -1;
		str = "World";
		l = -1;
		b = true;
	}
	
	public static void main(String[] args) {
		int [] array = new int[] {1,2,3};
		String str = "Hello";
		long l = 1;
		boolean b = false;
		method(array,str,l,b);
		System.out.println(array[0] + "\n" + str + "\n" + l + "\n" + b);
	}
}
