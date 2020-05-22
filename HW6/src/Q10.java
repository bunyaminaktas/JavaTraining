// Class name had to be changed to Q10
public class Q10 {
	private int rope = 1;
	protected boolean outside;
	public Q10() {
		/*
		 * - This will call the other constructor which will change the value of the rope.
		 */
		this(4);
		outside = true;
	}
	public Q10(int rope) {
		/*
		 * - Since the outside is not initialized at this point the value of the rope will be one more than
		 * the argument passed to this constructor.
		 */
		this.rope = outside ? rope : rope+1;
	}
	public static void main(String[] bounce) {
		System.out.print(new Q10().rope);
	}
}
