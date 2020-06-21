package hw10;
// Class name has been changed to Q01
public class Q01 {
	public static void main(String... books) {
		StringBuilder sb = new StringBuilder();
		for( String book : books)
			// Since sb is not given any value, indexOf() method will throw StringIndexOutOfBoundsException
			sb.insert(sb.indexOf("c"), book);
		System.out.println(sb);
	}
}
