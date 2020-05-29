package exercises;

class Marsupial{
	public static boolean isBiped() {
		return false;
	}
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: "+isBiped());
	}
}

class Kangaroo extends Marsupial{
	public static boolean isBiped() {
		return true;
	}
	public void getKangarooDescription() {
		System.out.println("Kangaroo walks on two legs: "+isBiped());
	}
	/*
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: "+isBiped());
	}
	*/
}

public class MarsupialTest {
	public static void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		
		/*
		 * - Since joey didn't overload the getMarsupialDescription method, this call will use the parent class's
		 * method. And since the method isBiped() is hidden, the parent class's method cannot see the child's 
		 * isBiped() method. This will cause that the getMarsupialDescription method in the parent class uses its
		 * own isBiped() method which returns false.
		 */
		joey.getMarsupialDescription();
		
		/*
		 * - This method is Kangaroo's own method so that it will use its own isBiped() method and even if it wanted
		 * to use the parent method, it could not since it is hidden.
		 */
		joey.getKangarooDescription();
	}
}
