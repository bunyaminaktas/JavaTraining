package exercises;

interface HasTail {
	 public boolean isTailStriped();
}

class Mouse extends Primate implements HasTail{
	public boolean isTailStriped() {
		return false;
	}
}

public class Lemur extends Primate implements HasTail{
	public boolean isTailStriped() {
		return false;
	}
	public boolean hasHair() {
		return false;
	}
	public void getVoid() {}
	public int age = 10;
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		Mouse mouse = new Mouse();
		
		HasTail hasTail = lemur;
		
		Primate primate = lemur;
		
		System.out.println(((Lemur)primate).age);
		System.out.println(((Primate)lemur).hasHair());
		System.out.println(primate.hasHair());

	}
}
