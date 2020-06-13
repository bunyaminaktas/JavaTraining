package hw09;

public class Q33 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); // sb = ""
		sb.append("red");	// sb = "red"
		sb.deleteCharAt(0);	// sb = "ed"
		sb.delete(1, 2);	// sb = "e"
		System.out.println(sb);
	}

}
