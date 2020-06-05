package hw8;

// Class name has been changed to Q10
public class Q10 {
	public void openDrawbridge() throws Exception { // p1
		try {
			throw new Exception("Circle");
		}catch (Exception e) {
			System.out.print("Opening!");
		}finally {
			System.out.print("Walls"); // p2
		}
	}
	/*	
	 * - Exception must be declared or handled in order to be able to call openDrawbridge() since it declares
	 * that it could throw an Exception. 
	 */
	public static void main(String[] moat) throws Exception {
		new Q10().openDrawbridge(); // p3
	}
}
