package hw8;

class CastleUnderSiegeException extends Exception{}
class KnightAttackingException extends CastleUnderSiegeException{}

// Class name Citadel has been changed to Q22
public class Q22 {
	public void openDrawbridge() throws RuntimeException { // q1
		try {
			throw new KnightAttackingException();
		} catch (Exception e) {
			throw new ClassCastException();
		} finally {
			try {
				throw new CastleUnderSiegeException();
			}catch(CastleUnderSiegeException c) {}
			// Original code
			/*
			 * - Exceptions in finally block must be handled. Since the next exception is not handled
			 * the code does not compile.
			 */
			//throw new CastleUnderSiegeException();	// q2
		}
	}
	public static void main(String[] moat) {
		new Q22().openDrawbridge();
	}
}
