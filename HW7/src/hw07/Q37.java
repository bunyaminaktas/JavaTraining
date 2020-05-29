package hw07;

interface SpeakDialogue { default int talk() { return 7; } }
interface SingMonologue { default int talk() { return 5; } }

// Class name Performance has been changed to Q37
public class Q37 implements SpeakDialogue, SingMonologue
{
	/*
	 * - Since this class inherits two same methods conflicting each other it must define a method with same
	 * as those.
	 * 
	 * - But the next method definition is not an overriding since its parameter list is different than the
	 * inherited ones.
	 */
	public int talk(String... x) {
		return x.length;
	}
	public static void main(String[] notes) {
		System.out.print(new Q37().talk(notes));
	}
	
	public int talk() {
		return 3;
	}
}
