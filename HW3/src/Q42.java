// Class name had to be changed to Q42
public class Q42 {
	public String runTest(boolean spinner, boolean roller) {
		// spinner = roller will return the value of the assigned variable which is true.
		if (spinner = roller) return "up";
		else return roller ? "down" : "middle";
	}
	public static final void main(String pieces[]) {
		final Q42 tester = new Q42();
		System.out.println(tester.runTest(false, true));
	}
}
