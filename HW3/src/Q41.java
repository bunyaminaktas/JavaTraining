// Class name had to be changed to Q41
public class Q41 {
	/*
	 * If threshold is bigger than 5 returns 1
	 * if not returns 0
	 */
	public static int getResult(int threshold) {
		return threshold > 5 ? 1 : 0;
	}
	public static final void main(String[] days) {
		/*
		 * None of the below method callings take a value bigger than 5,
		 * so all of them will return 0
		 */
		System.out.print(getResult(5)+getResult(1)+getResult(0)+getResult(2)+"");
	}
}
