package exercises;

public class SingletonClassTester {
	public static void main(String[] args) {
		SingletonClass sc = SingletonClass.getInstance();
		System.out.println(sc.count);
		SingletonClass sc2 = SingletonClass.getInstance();
		System.out.println(sc2.count);
		sc2.count = -1;
		SingletonClass sc3 = SingletonClass.getInstance();
		System.out.println(sc3.count);
	}
}
