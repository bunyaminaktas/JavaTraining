package hw09;

public class Q18 {

	public static void main(String[] args) {
		/*
		 * - String class is immutable so that unless String variables are reassigned they are not changed by the
		 * methods. So concat() method does not affect the data in teams.
		 */ 
		String teams = new String("694");
		teams.concat(" 1155");
		teams.concat(" 2265");
		teams.concat(" 2869");
		System.out.println(teams);
	}

}
