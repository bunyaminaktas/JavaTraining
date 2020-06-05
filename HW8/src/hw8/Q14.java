package hw8;
import java.io.*;

// Class name has been changed to Q14
public class Q14 {
	public void print() {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException enfe) { // This block must be here in order for the code to compile.
			System.out.print("X");
		}catch (IOException exception) {
			System.out.print("Z");
		}/* catch (FileNotFoundException enfe) { // Since previous exception is superclass of this one
												// it handles this exception instances, too, so this block
													// is not reachable. This block does not compile.
			System.out.print("X");
		}*/ finally {
			System.out.print("Y");
		}
	}
	public static void main(String... ink) {
		new Q14().print();
	}
}
