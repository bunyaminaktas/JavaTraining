import java.util.*;

public class Q19 {
	public static void main(String[] args) {
		/*
		 * - If we only provide that the boolean expressions in loops
		 * return true always, then that loop would never end.
		 */
		
		// while loop
		while(true) {
			System.out.println("If we remove the break statement "
					+ "in this WHILE loop"
					+ " it is never going to terminate.");
			break;
		}
		
		for(; true; ) { // Simply put single boolean expression missing the other two segments
			System.out.println("If we remove the break statement in this TRADITIONAL FOR loop"
					+ " it is never going to terminate.");
			break;
		}
		
		do {
			System.out.println("If we remove the break statement "
					+ "in this DO-WHILE loop"
					+ " it is never going to terminate.");
			break;
		}while(true);
		
		int array [] = new int[] {1,2,3,4,5};
		for( int i : array) {
			System.out.println(i + " - This ENHANCED FOR loop will terminate eventually");
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		for(int i : list) {
			System.out.println(i + " - This ENHANCED FOR loop will terminate, too");
		}
		
		/*
		 * - Trying to expand the list while iterating,
		 * giving ConcurrentModificationException
		 */
		
		int count = 3;
		for(int i : list) {
			System.out.println(i + " - But what if we always expand the list");
			//int num = i + 1;
			list.add(new Integer(count++));
		}
		
	}
}
