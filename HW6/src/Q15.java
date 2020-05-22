// Class name had to be changed to the Q15
public class Q15 {
	private int age = 18;
	private static void slalom(Q15 racer, int[] speed, String name) {
		// Copy reference to a Ski object, changes the age property in that object
		racer.age = 18;
		
		// name is a String variable which is immutable so that the value change will not affect the original variable
		name = "Wendy";
		
		// speed reference name is reassigned so that the point to the original object is lost.
		speed = new int[1];
		speed[0] = 11;
		
		// racer is a copy reference so that assigning it to null object does not affect the original reference.
		racer = null;
	}
	public static void main(String[] args) {
		final Q15 mySkier = new Q15();
		mySkier.age = 16;
		final int[] mySpeed = new int[1];
		final String myName = "Rosie";
		slalom(mySkier, mySpeed, myName);
		System.out.println(mySkier.age + "\n" + mySpeed[0] + "\n" + myName);
	}
}
