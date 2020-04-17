package hw1;

public class Q18 {
	public static void main(String [] args) {
		String tree = "pine";
		int count = 0;
		int height = -1; // This should be defined here so that it can be accessed at everywhere in main().
		if(tree.equals("pine")){
			height = 55;
			count = count + 1;
		}
		System.out.print(height + count);	
		
		
		
		// Original snippet
		
		/*
		String tree = "pine";
		int count = 0;
		if(tree.equals("pine")){
			int height = 55;	// A local variable that cannot be accessed from outside of this block.
			count = count + 1;
		}
		System.out.print(height + count);
		*/
	}
}
