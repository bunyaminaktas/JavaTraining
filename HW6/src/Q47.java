// Class name had to be changed to Q47
public class Q47 {
	public static Long getScore(Long timeRemaining) {
		return 2*timeRemaining;						// m1
	}
	public static void main(String[] refs) {
		final int startTime = 4;
		
		// Since int cannot be converted to Long this line will cause compilation error.
		// int must be cast to long.
		//System.out.print(getScore(startTime)); 		// m2
		
		System.out.print(getScore((long)startTime)); 
	}
}
