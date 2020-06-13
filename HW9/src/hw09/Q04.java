package hw09;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * - StringBuilder class is mutable so that methods called on StringBuilder objects, changes the data
		 * stored in them.
		 */
		StringBuilder teams = new StringBuilder("333");
		teams.append(" 806");
		teams.append(" 1601");
		System.out.println(teams);
	}

}
