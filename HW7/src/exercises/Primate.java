package exercises;

public class Primate {
	public boolean hasHair() {
		return true;
	}
	
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.hasHair());
		
		Primate primate = new Primate();
		System.out.println(primate.hasHair());
	}
}
