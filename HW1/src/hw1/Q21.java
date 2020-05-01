package hw1;

// Because class name must be same with the filename, I changed Tolls to Q21
public class Q21 {
	private static int yesterday = 1;
	int tomorrow = 10; // This tomorrow is an instance variable.
	public static void main(String[] args) {
		Q21 q21 = new Q21();
		int today = 20, tomorrow = 40; // This tomorrow is a local one. It is different from the previous one.
										//yesterday is static variable, so it is recommended to access it 
												//in a static way
										//because it can cause a problem when there is ambiguity.
		System.out.print(today + q21.tomorrow + q21.yesterday);
	}
}
