// Class name had to be changed to Q03
public class Q03 {
	private static int price = 5;
	public boolean sell() {
		if(price<10) {
			price++;
			return true;
		} else if(price>=10) {
			return false;
		} 
		/*
		 * - There has to be an else situation in order the code to be compiled. Java does not allow
		 * a situation that the method might not return a value. So, there has to be a default case to be returned.
		 */
		else
			return true;
	}
	public static void main(String[] args) {
		new Q03().sell();
		new Q03().sell();
		new Q03().sell();
		
		/*
		 * - Since price is static, it is shared among the objects. The value of it will be incremented at
		 * each time a caller calls sell() method. And every object will have the same price variable.
		 */
		System.out.println(price);
	}
}
