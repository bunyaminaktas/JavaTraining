package hw8;

// Class name Address has been changed to Q35
public class Q35 {
	public String getAdress(String street, String city) {
		try {
			return street.toString() + " : " + city.toString();
		}finally { // this block runs before method exits.
			System.out.print("Posted:");
		}
	}
	public static void main(String[] args) {
		String street = "350 5th Ave";
		String city = "New York";
		System.out.print(new Q35().getAdress(street, city));
	}
}
