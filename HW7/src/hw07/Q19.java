package hw07;

interface Horn { public Integer play(); }
abstract class Woodwind { public Short play() { return 3; } }

// Class name Saxophone has been changed to Q18
public final class Q19 extends Woodwind /*implements Horn*/ {
	/*
	 * - This class must provide an overridden method which is compatible with both methods inherited.
	 * But since Integer and Short is not a subclass of the other this is not possible.
	 */
	/*public Integer play() {
		return null;
	}*/
}
