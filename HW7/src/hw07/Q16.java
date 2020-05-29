package hw07;

class Ship {
	protected int weight = 3;
	private int height = 5;
	public int getWeight() { return weight; }
	public int getHeight() { return height; }
}

//Class name Rocket has been changed to Q16
public class Q16 extends Ship {
	public int weight = 2; // hiding parent variable weight.
	public int height = 4; // not related to parent variable height since it's private
	public void printDetails() {
		
		System.out.print(super.getWeight()+","+super.getHeight());
		
		// Since height of parent class is private, it cannot be reached from here.
		//System.out.print(super.getWeight()+","+super.height);
	}
	public static final void main(String[] fuel) {
		new Q16().printDetails();
	}
}
