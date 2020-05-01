// Class name had to be changed to Q31
public class Q31 {
	public static void main(String[] unused) {
		String bob = new String("bob");
		String notBob = bob; // bob object is assigned to the notBob reference.
		
		// For they are same object they are equals both in sense object equality and in sense of value equality. 
		System.out.print((bob==notBob)+" "+(bob.equals(notBob)));
	}
}
