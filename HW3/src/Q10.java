// Class name had to be changed to Q10
public class Q10 {
	public final static void main(String... arguments) {
		int pterodactyl = 6;
		long triceratops = 3;
		if(pterodactyl % 3 >= 1) // checks the remaining value of pterodactyl / 3.
			triceratops++; // This line belongs to the if-then statement and will be skipped.
			triceratops--; // This line is a standalone statement which does not belong to the if-then statement.
							// So this line will be executed.
		System.out.print(triceratops);
	}
}
