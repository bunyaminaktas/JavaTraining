package hw09;

public class Q01 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		if(sb1 == sb2)
			System.out.println("StringBuilder CAN use == to compare values");
		else
			System.out.println("StringBuilder CANNOT use == to compare values");
	}
}
