
public class Q43 {
	public static void main(String...strings) {
		String[][] listing = new String[][] { { "Book" }, { "Game", "29.99" } };
		
		/* - When length attribute is used with onyl the array name it returns the length of the  
		 * first dimension's length. 
		 * 
		 * - In order to get the length of the arrays held in the array, we need to specify that array's
		 * index.
		 */
		System.out.println(listing.length + " " + listing[0].length);
	}
}
