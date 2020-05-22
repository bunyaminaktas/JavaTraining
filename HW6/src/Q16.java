// Class name had to be changed to the Q16
public class Q16 {
	// Original method
	public Integer findAverage(int sum) { return sum; }
	
	/*
	 * - This has same name as the original one and a same parameter list.
	 * For overloading, we must have same name but a different parameter list.
	 */
	//public Long findAverage(int sum) { return (long)sum; }
	
	// This one has a different parameter list so that this one is a successful overloading 
	public Long findAverage(int sum, int divisor) { return (long)(sum / divisor); }
	
	// This one has a different name. So this is not overloading.
	public Integer average(int sum) { return sum; }
	
	// Same name with a same parameter list so that this is not overloading. This is considered as same method.
	// private void findAverage(int sum) {}
}
