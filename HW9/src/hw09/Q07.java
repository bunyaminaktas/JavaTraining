package hw09;

public class Q07 {

	public static void main(String[] args) {
		// Original code
		/*
		 * - Since sb is in the process of initialization, it cannot be used in expressions.
		 */
		//StringBuilder sb = new StringBuilder("radical").insert(sb.length(), "robots");
		
		StringBuilder sb = new StringBuilder("radical");
		sb.insert(sb.length(), "robots");
		System.out.println(sb);
	}
}
