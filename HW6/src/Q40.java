// Class name had to be changed to Q40
public class Q40 {
	public static void water() {}
	public void get() {
		water();
		
		/*
		 * - this refers to class attributes. So there must be a Q40 attribute if we use this word after this.
		 */
		//this.Q40.water();
		this.water();
		Q40.water();
	}
}
