package exercises;

public class StaticInstanceMembersExercises {
	/*
	 * - Can a static method call another static member using a reference variable 
	 */
	
	private static int count = 0;
	public static void main(String[] args) {
		StaticInstanceMembersExercises s = new StaticInstanceMembersExercises();
		System.out.println(StaticInstanceMembersExercises.count);
		System.out.println(s.count);
		
		// Method overloading
		//s.fly(1);
		//s.fly((short)1);
		
		// Call a method with long parameter, with an int parameter
		int [] array = new int[] {1,2,3,4,5};
		//This does not work when worked with arrays.
		//s.fly((long[])array);
	}
	
	/*
	 * - Method overloading
	 */
	public void getCount() {}
	public static void getCount(int n) {}
	void fly(int nums, short numFeed) {}
	public void fly(short nums, int numFeed) {}
	
	/*public void fly(int num) {
		System.out.println("int");
	}*/
	/*public void fly(short num) {
		System.out.println("short");
	}*/
	
	/*
	 * - If there was not a method has a parameter with int, Java will use autoboxing
	 */
	/*public void fly(Integer num) {
		System.out.println("Integer");
	}*/
	
	/*
	 * - 
	 */
	public void fly(long[] array) {
		for(long l : array)
			System.out.println(l);
	}
}
