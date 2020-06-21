package hw10;

public class Q10 {
    public static void main(String[] args) {
        String lol = "lol";

        System.out.println(lol.toUpperCase() == lol); // false
        System.out.println(lol.toUpperCase() == lol.toUpperCase()); //false
        System.out.println(lol.toUpperCase().equals(lol)); //false
        System.out.println(lol.toUpperCase().equals(lol.toUpperCase())); //true
        System.out.println(lol.toUpperCase().equalsIgnoreCase(lol)); //true
        System.out.println(lol.toUpperCase().equalsIgnoreCase(lol.toUpperCase())); //true
    }
}

