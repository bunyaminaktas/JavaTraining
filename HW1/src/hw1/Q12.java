package hw1;

/* 
 * The class name must be same with the file name in which the class resides.
 * So I had to change the class name to Q12
 */
public class Q12 {
	int birds = 10;
	public static void main(String[] args) {
		int trees = 5;
		Q12 q12 = new Q12(); // An object must be created to access to instance variables such as birds
		System.out.println(trees+q12.birds);
	}
}




// Original code
/*
public class ParkRanger {
	int birds = 10;
	public static void main(String[] args) {
		int trees = 5;
		System.out.println(trees+birds);
	}
}
*/