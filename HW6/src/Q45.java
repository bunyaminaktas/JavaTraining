// Class name RainForest changed to Q45
public class Q45 extends Forest{
	public Q45(long treeCount) {
		// Since parent class does not have a no-argument constructor, we must explicitly call parent constructor.
		super(5);
		this.treeCount = treeCount+1;
	}
	public static void main(String[] birds) {
		System.out.print(new Q45(5).treeCount);
	}
	
}

class Forest {
	public long treeCount;
	public Forest(long treeCount) {
		this.treeCount = treeCount+2;
	}
}
