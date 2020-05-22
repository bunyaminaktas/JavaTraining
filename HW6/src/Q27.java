
public class Q27 {
	public static void method(int[] array, boolean b) {
		/*
		 * - Since array is a reference so that the object this reference points can be modified.
		 * But reassigning the reference does not reflect in the calling method.
		 */
		array[0] = -1;
		array = null;
		b = true;
	}
	
	public static void main(String[] args) {
		int [] array = new int[] {1,2,3};
		boolean b = false;
		method(array,b);
		if(array != null)
			System.out.println(array[0] + "\n" + b);
	}
}
