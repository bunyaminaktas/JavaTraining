import java.util.ArrayList;

public class Q26 {
	public static void main(String[] args) {
		/*
		 * - Enhanced for loop has two segments, first one of which is 
		 * a variable declaration whose data type is the same as 
		 * the data type of the members of the collection that is 
		 * to be iterated through and that is the second segment of the loop. 
		 */
		
		/*
		 * - taxisList is a List type variable consisting of Integer objects
		 */
		ArrayList<Integer> taxisList = new ArrayList<Integer>();
		for(Object obj : taxisList) {
		}
		
		/*
		 * - int[] is actually consisted of int primitive values but
		 * Java has autoboxing feature which converts primitive values
		 * to their corresponding wrapper objects. 
		 * 
		 * - Here Java will convert int to Integer and since Integer is 
		 * an Object, the loop will run smoothly.
		 */
		int[] taxisInt = new int[] {1,2};
		for (Object obj : taxisInt) {
			if(obj instanceof Integer) System.out.println("obj is an instance of"
					+ " Integer");
			if(obj instanceof Object) System.out.println("obj is an instance of"
					+ " Object\n--------------------------------");
		}
		
		/*
		 * - Since StringBuilder does not implement java.lang.Iterable
		 * class, for-each loop cannot iterate over StringBuilder objects.
		 */
		StringBuilder taxisSB = new StringBuilder();
		taxisSB.append("Hello");
		//for (Object obj : taxisSB) {}
	}
}
