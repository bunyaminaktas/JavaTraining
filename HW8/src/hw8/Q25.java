package hw8;

// Class name Attendance has been changed to Q25
public class Q25 {
	/*
	 * - list may be assigned a null object which would cause NullPointerException
	 * or the size could be less than 10 which would cause an ArrayIndexOutOfBoundsException
	 */
	private Boolean[] list = new Boolean[] {true};
	public int printTodaysCount() {
		int count=0;
		for(int i=0; i<10; i++) {
			if(list[i]) ++count;
		}
		return count;
	}
	public static void main(String[] roster) {
		new Q25().printTodaysCount();
	}
}
