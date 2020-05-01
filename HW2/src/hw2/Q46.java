package hw2;

// Class name had to be changed to Q46
public class Q46 {
	public Q46 youngestChild;
	
	public static void main(String...strings) {
		Q46 elena = new Q46();
		Q46 diana = new Q46();
		elena.youngestChild = diana; // elena object referenced to diana object
		diana = null; // diana object has no reference any more.
		Q46 zoe = new Q46();
		elena.youngestChild = zoe; // elena object's reference changed to zoe object.
		zoe = null; // zoe object's reference is nulled.
					// now diana object is not in use.
	}
}
