// Class name had to be changed to Q44
public class Q44 {
	public final static long numberOfTrees;
	public final double height;
	static {} // An empty static initializer
	
	// Instance initializer
	{ final int initHeight = 2;
	  height = initHeight;
	}
	static {
		numberOfTrees = 100;
		//height = 4; // instance members of a class cannot be referred by static members
	}
}
