package hw8;
import java.io.*;

// Class name has been changed to Q49
public class Q49 {
	public void performBackup() {
		try {
			throw new IOException("Disk not found");
		} catch(Exception e) {
			try {
				throw new FileNotFoundException("File not found");
			} catch (FileNotFoundException r) {
				System.out.print("Failed");
			}
			/*
			 * - e is used in outer catch block so it cannot be used to identify another exception here.
			 */
			/*catch (FileNotFoundException e) {		// z1
				System.out.print("Failed");
			}*/
		}
	}
	public static void main(String... files) {
		new Q49().performBackup();	// z2
	}
}
