package hw10;

class Big {
	public Big(boolean stillIn) {
		super();
	}
}
public class Q29 extends Big {
	//public Q29() {}
	public Q29(int deep) {
		super(false);
//		this();
	}
	public Q29(String now, int... deep) {
		this(3);
	}
// Q29(long deep) {
//		this("check",deep);
//	}
	public Q29(double test) {
		super(test>5 ? true : false);
	}
}
