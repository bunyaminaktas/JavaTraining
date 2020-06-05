package hw8;

// Class name has been changed to Q43
public class Q43 {
	public static void dancing() throws RuntimeException{
		try {
			throw new IllegalArgumentException();
		}
		catch(Error e) {
			System.out.print("Unable!");
		}
		// Original code
		/*
		catch(Error) { // missing exception identifier here. the code does not compile.
			System.out.print("Unable!");
		}*/
	}
	public static void main(String... count) throws RuntimeException {
		dancing();
	}
}
