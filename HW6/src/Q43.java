
public class Q43 {
	private final int num;
	{}
	
	public Q43() {
		num = 5;
	}
	public Q43(int num) {
		this.num = num;
	}
}

class Test extends Q43{
	/*// A class does not have to have a constructor explicitly defined.
	public Test(){
		/*
		 * - Parent constructor has not to be called since Java will call it automatically. But if the parent 
		 * does not have no-argument constructor, then it must be called explicitly.
		 */
		// If parent constructor has parameter list, then arguments can be passed to it.
		//super(5);
	//}
	
}
