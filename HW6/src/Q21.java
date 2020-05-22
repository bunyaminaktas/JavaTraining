// Class name had to be changed to Q21
public final class Q21 { // final keyword makes classes non-extendible
	public final static int finish(int score) { // final makes method non-overloadable
													// final of score must be removed since it is attempted to be reassigned.
		final int win = 3;
		int result = score++ < 5 ? 2 : win;
		return result+=win;
		
		// Original statements
		/*
		 * - final variables cannot be reassigned.
		 */
		/*
		final int result = score++ < 5 ? 2 : win;
		return result+=win;
		*/
	}
	public static void main(final String[] v) {
		System.out.print(finish(Integer.parseInt(v[0])));
	}
}
