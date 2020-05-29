package hw07;

// Class name had to be changed to Q03
public class Q03 {
	/*
	 * - If two methods share the same name and the same parameter list Java will consider them as duplicate
	 * methods.
	 * 
	 * - If we change the parameter list one of them then they would be overloaded methods and Java would compile code
	 * 
	 * - However we have another problem that the second method which has int return type, does not return anything.
	 * We must add a return statement.
	 */
	public void playMusic() {
		System.out.print("Play!");
	}
	private static int playMusic(int count) {
		System.out.print("Music!");
		return count;
	}
	public static void main(String[] tracks) {
		new Q03().playMusic();
	}
	
	// Original code
	/*
	public void playMusic() {
		System.out.print("Play!");
	}
	private static int playMusic() {
		System.out.print("Music!");
	}
	*/
}
