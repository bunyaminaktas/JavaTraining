package hw8;
interface Source {
	void flipSwitch() throws Exception;
}

// Class name LightBulb has been changed to Q47
public class Q47 implements Source {
	public void flipSwitch() {
		try {
			// throws keyword cannot be used here.
			//throws new RuntimeException("Circuit Break!");
			
			throw new RuntimeException("Circuit Break!");
		} finally {
			System.out.print("Flipped!");
		}
	}
	public static void main(String... electricity) throws Throwable {
		final Source bulb = new Q47();
		bulb.flipSwitch();
	}
}
