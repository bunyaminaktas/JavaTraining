package exercises;

public class VarargExamples {
	public static void walk(int... nums) {
		System.out.println(nums == null);
	}
	public static void main(String[] args) {
		walk(null); 	// vararg parameter created an array pointing to null object
		walk(1,2,3,4); 	// vararg parameter created an array 4 sized
		walk();			// vararg paramater created an array 0 sized 
	}
}
