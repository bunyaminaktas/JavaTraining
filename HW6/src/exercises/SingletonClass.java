package exercises;
/*
 * - Attempt to implement a class that can at most one object at a time.
 */
public class SingletonClass {
	private static SingletonClass instance;
	static int count;
	
	/*
	 * - Since the construction is private, any instance of this class cannot be instantiated from outside
	 */
	private SingletonClass() {
		count++;
	}
	
	public static SingletonClass getInstance() {
		if(instance == null)
			instance = new SingletonClass();
		return instance;
	}
}
