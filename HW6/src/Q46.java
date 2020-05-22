// Class name had to be changed to Q46
public class Q46 {
	// Since all classes are subclasses of Object, super() can be used calling Object's no-argument constructor.
	public Q46() { super(); }
	public int choose(int choice) { return 5; }
	public int choose(short choice) { return 2; }
	public int choose(long choice) { return 11; }
	public static void main(String[] path) {
		/*
		 * - This method pass adds a byte value with an int value so that it pass an int value to choose()
		 * method. Java will select the closest method to this argument. Since the argument is int, the closest
		 * parameter could be int and long, respectively.
		 * 
		 * - Since there is a method with an int parameter, Java will select it.
		 */
		System.out.print(new Q46().choose((byte)2+1));
	}
}
