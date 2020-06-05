package hw8;
class OutOfBoundsException extends BadCatchException{}
class BadCatchException extends Exception{}
// Interface name Outfielder has been changed to Q42
public interface Q42 {
	public void catchBall() throws OutOfBoundsException;
}

class Test2 implements Q42{
	// Original code
	/*
	 * - Overridden methods must have same return type as their parent method.
	 * 
	 * - Overridden methods must not declare a new or a broader exception than their parent method.
	 */
	/*
	public int catchBall() throws OutOfBoundsException{
		return 0;
	}
	*/
	/*
	public int catchBall() throws BadCatchException{
		return 0;
	}
	*/
	/*
	public int catchBall() throws Exception{
		return 0;
	}
	*/
	public void catchBall() throws OutOfBoundsException {
		
	}
}
