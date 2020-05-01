// Class name had to be changed to Q34
public class Q34 {
	public static void main(String... data) {
		/*
		 * - If data is empty or has more elements than 1 the code will print nothing
		 * - If data has one element and if that element is sound or logic then it will be printed,
		 * if the element is different than sound and logic then again the will not print anything.
		 */
		if(data.length>=1 && (data[0].equals("sound") || data[0].equals("logic")) && data.length <2) {
			System.out.print(data[0]);
		}
	}
}
