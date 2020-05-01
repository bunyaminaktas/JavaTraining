
public class Q14 {
	public static void main(String...strings)
	{
		int x = 9; // 1001 in bits
		int y = 7; // 0111 in bits
		int t = x & y; // 1 & 0 = 0, 0 & 1 = 0, 0 & 1 = 0, 1 & 1 = 1 => 0001
		
		System.out.println(t);
	}
}
