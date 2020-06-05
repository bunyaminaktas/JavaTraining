package hw8;

public class Q11 {
	public void test() throws NullPointerException, ArithmeticException, RuntimeException {}
	public void test2() throws Exception {}
	public static void main(String[] args) {
		Q11 q11 = new Q11();
		q11.test(); // runtime exceptions are not required to be declared or handled.
		//q11.test2(); // checked exception are required to be declared or handled.
		try {
			q11.test2();
		}catch(Exception e) {
			// Having no code here means masking the exception which should be avoided.
		}
	}
}
