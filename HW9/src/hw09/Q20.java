package hw09;

public class Q20 {

	public static void main(String[] args) {
		/*
		 * - append() method appends the given String value at the end.
		 * - delete() method deletes the String value between the given indexes, former index is included.
		 * - insert() method inserts the String value starting from the given index.
		 */
		StringBuilder sb = new StringBuilder("radical ");
		sb = new StringBuilder("radical ")
				.append("robots");
		System.out.println(sb);
		
		sb = new StringBuilder("radical ")
				.delete(1, 100)
				.append("obots")
				.insert(1, "adical r");
		System.out.println(sb);
		
		/*
		 * - This one insert "robots" at the index 7 which is right after the "l".
		 */
		sb = new StringBuilder("radical ")
				.insert(7, "robots");
		System.out.println(sb);
		
		sb = new StringBuilder("radical ")
				.insert(8, "robots");
		System.out.print(sb);
	}

}
