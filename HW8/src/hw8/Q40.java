package hw8;

//Class name has been changed to Q40
public class Q40 {
	public Long zipper() throws Exception{
		try {
			String checkZipper = (String)new Object(); // throws ClassCastException
		} catch(Exception e) { // catches runtime exceptions, too, since they are subclass of Exception
			// This statement requires a new keyword since it creates an object.
			//throw RuntimeException("Broken!");
			
			throw new RuntimeException("Broken!"); // throw runtime exception.
		}
		return null;
	}
	public static void main(String... warmth) {
		try {
			new Q40().zipper(); // throw a RuntimeException with a message "Broken!"
			System.out.print("Finished!");
		}catch(Throwable t) {
			// catches all exceptions since all of them are child of Throwable.
			// any exception that might be thrown, is handled here.
		}
	}
}
