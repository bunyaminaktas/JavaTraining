package hw8;

class CapsizedException extends Exception{}
class Transport {
	public int travel() throws CapsizedException{return 2; }
}

// Class name Boat has been changed to Q17
public class Q17 {
	public int travel() throws Exception { return 4; };  // j1
	public static void main(String... distance) throws Exception {
		try {
			System.out.print(new Q17().travel());
		} catch (Exception e) { // brackets must be used here. 
			System.out.print(8);
		}
	}
}
