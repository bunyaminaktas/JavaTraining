// Class name "Election" had to be changed to "Q09"
public class Q09 {
	public void calculateResult(Integer candidateA, Integer candidateB){
		boolean process = candidateA == null || candidateA.intValue() < 10;
		/*
		 * - This type of comparison for boolean results are not valid in Java
		 * unlike other programming languages. So the code does not compile.
		 */
		// boolean value = candidateA && candidateB;
		
	}
	
	/* Original code
	public void calculateResult(Integer candidateA, Integer candidateB){
		boolean process = candidateA == null || candidateA.intValue() < 10;
		boolean value = candidateA && candidateB;
		System.out.print(process || value);
	}
	public static void main(String[] unused){
		new Q09().calculateResult(null, 203);
	}
	*/
}