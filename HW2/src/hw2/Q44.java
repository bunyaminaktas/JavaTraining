package hw2;

// Class name had to be changed to Q44
public class Q44 {
	private double beakLength;
	
	/*
	 * This method can be used to call without creating an object, since it is static,
	 * and to set a new value to beackLength of any object.  
	 */
	public static void setBeakLength(Q44 p, int b) {
		p.beakLength = b; // This beakLength is not the one that is in the current class.
	}
}
