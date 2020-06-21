package hw10;

public class Q08 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Leaves growing");
		do {
			builder.delete(0, 5);
		} while (builder.length() > 5);
		System.out.println(builder);
	}

}
