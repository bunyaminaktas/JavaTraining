package hw07;

abstract class Ball {
	protected final int size;
	public Ball(int size) {
		this.size = size;
	}
}
interface Equipment{}

// Class name SoccerBall has been change to Q29
public class Q29 extends Ball implements Equipment {
	public Q29() {
		super(5);
	}
	public Ball get() { return this; }
	public static void main(String[] passes) {
		/*
		 * - Casting from SoccerBall to Ball and Equipment respectively which is legal since SoccerBall
		 * implement Equipment.
		 */
		Equipment equipment = (Equipment)(Ball)new Q29().get();
		
		// size is the property of Ball and inherited by SoccerBall.
		System.out.print(((Q29)equipment).size);
	}
}
