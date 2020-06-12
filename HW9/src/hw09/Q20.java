package hw09;

public class Q20 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("radical ");
		sb = new StringBuilder("radical ")
				.append("robots");
		System.out.println(sb);
		
		sb = new StringBuilder("radical ")
				.delete(1, 100)
				.append("obots")
				.insert(1, "adical r");
		System.out.println(sb);
		
		sb = new StringBuilder("radical ")
				.insert(7, "robots");
		System.out.println(sb);
		
		sb = new StringBuilder("radical ")
				.insert(8, "robots");
		System.out.print(sb);
	}

}
