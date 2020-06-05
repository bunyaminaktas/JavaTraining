package hw8;
// RuntimeException is not an interface so that it cannot be implemented but extended.
//class Problem implements RuntimeException{}

class Problem extends RuntimeException{}

// Class name BiggerProblem has been changed to Q46
public class Q46 extends Problem {
	public static void main(String uhOh[]) {
		try {
			throw new Q46(); // throws BiggerProblem which is a runtime exception.
		} catch (Q46 re) {	// thrown exception is caught here.
			System.out.print("Problem?");
		} catch (Problem e) { // there is no exception to be caught here.
			System.out.print("Handled");
		} finally {
			System.out.print("Fixed!");
		}
	}
}
