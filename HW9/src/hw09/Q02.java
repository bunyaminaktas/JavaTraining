package hw09;

public class Q02 /* extends String */{ // String cannot be extended which means it is final.

	public static void main(String[] args) {
		String str = " str "; // String can be created without calling constructor.
		str.trim();
		if(str.contains(" "))
			System.out.println("String class is immutable");
		else
			System.out.println("String class is mutable");
	}

}
