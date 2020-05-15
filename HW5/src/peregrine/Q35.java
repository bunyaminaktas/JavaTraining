package peregrine;

// Class name had to be changed to the Q35
public class Q35 {
	public static void main(String[] args) {
		/*
		 * - main() method's parameter acts like a varargs that it takes
		 * argument from the command line and puts them into an array.
		 */ 
		for(int i = args.length - 1; i >= 0; i--)
			System.out.println(args[i]);
		
		// Original code
		/* - Arrays are zero based, the last index of arrays is
		 * array.length - 1. So the attempt below to reach to the index of
		 * args.length will throw an ArrayIndexOutOfBoundsException.
		 
		for(int i = args.length; i >= 0; i--)
			System.out.println(args[i]);
		*/
	}
}
