// Class name had to be changed to Q02
public class Q02 {
	public static void toss(Frisbee... f) {
		/*
		 * - varargs are treated such an array that in order to get first element of f,
		 * we use f[0].
		 */
		Frisbee first = f[0];
		System.out.println(first);
	}
	
	public static void main(String... args) {
		// Array f is created and initialized with 3 elements 
		//Frisbee[] f = new Frisbee[] {new Frisbee("blue",3), new Frisbee("yellow", 4), new Frisbee("red", 5)};
		
		// Using new Frisbee[] is redundant in Java so that this style of creating an array could be used, too
		Frisbee[] f = {new Frisbee("blue",3), new Frisbee("yellow", 4), new Frisbee("red", 5)};
		
		// If we only specify the size of the array, then the elements for the array are created with default value
		// In this case the default value, for an object type, would be null.
		// Frisbee [] f = new Frisbee[3];
		
		// But this one cannot be done.
		//Frisbee [] f = (3)
		
		toss(f);
	}
}

/*
 * Class Frisbee created to be used in example.
 */
class Frisbee
{
	static int count = 0;
	int index;
	String color;
	int r;
	
	public Frisbee(String color, int r)
	{
		this.index = ++count;
		this.color = color;
		this.r = r;
	}
	public String toString() {
		return index + ". frisbee!\n" + "Color: " + color + "\nr: " + r;
	}
}
