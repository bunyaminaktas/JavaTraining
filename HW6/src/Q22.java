
public class Q22 extends Q22ParentClass {
	public Q22() {
		super();			// call the constructor of parent class
		super.calculate();	// calls a member of parent class
	}
	public static void main(String[] args) {
		new Q22();
	}
}
