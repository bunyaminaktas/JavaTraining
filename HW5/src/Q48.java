
public class Q48 {
	public static void main(String[] args) {
		int result = 8;
		f: while(result >7) {
			result++;
			do {
				result--;
			}while(result > 5);
			break f;
		}
		System.out.println(result);
		
		/* - Original code
		 * 
		 * - Reserved keyword are blocked from being used.
		 * - for is a reserved word in Java
		 * - It cannot be used as name for labels or classes or variables, etc.
		 * 
		for: while(result >7) {
			result++;
			do {
				result--;
			}while(result > 5);
			break for;
		}
		System.out.println(result);
		*/
	}
}
