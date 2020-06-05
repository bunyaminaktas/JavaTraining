package exercises;

public class ExceptionExercise {
	static void fall() {
		throw new RuntimeException();
	}
	static void getUp() {System.out.println("getting up");}
	static void explore() {
		System.exit(0);
		try {
			fall();
			System.out.println("never get here");
		}catch(RuntimeException e){
			getUp();
		}finally {
			
		}
		System.out.println("Hello World");
	}
	@SuppressWarnings("finally")
	public static String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException();
			}
			finally {
				result += "finally";
				throw new Exception();
			}
		} catch (Exception e){
			result += "done";
		}
		return result;
	}
	public int numberEggs = 3;
	public void setNumberEggs(int numberEggs) {
		if (numberEggs < 0)
		throw new IllegalArgumentException(
		"# eggs must not be negative");
		this.numberEggs = numberEggs;
	}
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
	public static void main(String[] args) {
		//explore();
		String s = exceptions();
		//System.out.println(s);
		try{
			new ExceptionExercise().setNumberEggs(-3);
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		String name = null;
		//System.out.println(name.length());
		hop();
		try {
			hop();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
