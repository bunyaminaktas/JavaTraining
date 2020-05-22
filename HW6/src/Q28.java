// Class name had to be changed to Q28
public class Q28 {
	/* 
	 * - Since this field is final that must be initialized either in its declaration statement or 
	 * in an instance initializer or in a static initializer or in a constructor. 
	 * If it is not initialized in one of these structures the code does not compile.
	 */
	private final Object contents;
	
	// In order this code to compile, this constructor is implemented.
	public Q28() {
		contents = new Object();
	}
	
	protected Object getContents() {
		return contents;
	}
	protected void setContents(Object contents) {
		// Since contents is final, it cannot be reassigned.
		//this.contents = contents;
	}
	public void showPresent() {
		System.out.println("Your gift: "+contents);
	}
	public static void main(String[] treats) {
		Q28 gift = new Q28();
		gift.setContents(gift);
		gift.showPresent();
	}
}
