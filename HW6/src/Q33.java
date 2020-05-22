
public class Q33 {
	/*
	 * - static variables are shared among all instances.
	 * - final variables cannot be reassigned.
	 * - final static variables are class variables that does not belong to objects but to classes and are
	 * not changeable. So if we attempt assign final static variables in constructor they may get reassigned.
	 * So Java does not allow this. They can be initialized in declaration lines or in static initializers.
	 */
	private final static int value;
	static {
		value = 4;
	}
	public Q33() {
		//value = 4;
	}
}