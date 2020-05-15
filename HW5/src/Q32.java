
public class Q32 {
	public static void main(String[] args) {
		String [] fun = new String[] {"Hello", "World"};
		// Original for loop
		for(int i = fun.length-1; i>=0; i--)
			System.out.println(fun[i]);
		
		// for-each loop in option B
		for(String f : fun) System.out.println(f);
		
		// There is no syntax String f = fun or as String f fun
		//for(String f  = fun) System.out.println(f);
				
		//for(String f fun) System.out.println(it);
	}
}
