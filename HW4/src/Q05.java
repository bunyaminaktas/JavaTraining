import java.util.Arrays;

public class Q05 {
	// The methods has been made to be able to call them without creating an object.
	
	public static void printStormName(String... names) {
		System.out.println(Arrays.deepToString(names));
	}
	public static void printStormNames(String[] names) {
		System.out.println(Arrays.toString(names));
	}
	
	public static void main(String...strings) {
		// A
		// The String value "Arlene" will be taken by Java and placed in an array of size 1.
		printStormName("Arlene");
		
		// B
		// In this call, an array is passed to the method so this is valid.
		printStormName(new String[] { "Bret" });
		
		// C
		// In this call a method, which has an array parameter, is called so that the argument that is passed,
		// must be an array. So this call is not valid.
		//printStormNames("Cindy");
		
		// D
		// As explained above this call is valid.
		printStormNames(new String[] { "Don" });
	}
}
