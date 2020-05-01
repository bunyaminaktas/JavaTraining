// Class name had to be changed to Q23
public class Q23 {
	public static void main(String[] input) {
		int dog = 11;
		int cat = 3;
		int partA = dog / cat; // returns a whole number which will be 3
		int partB = dog % cat; // returns remainder which is 2
		int newDog = partB + partA * cat;
		System.out.print(newDog);
	}
}
