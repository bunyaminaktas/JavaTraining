package hw10;

public class Q16 {
    public static void main(String[] args) {
        String shoe1 = new String("sandal"); //eligible for GC
        String shoe2 = new String("flip flop");
        String shoe3 = new String("croc");

        shoe1 = shoe2;
        shoe2 = shoe3;
        shoe3 = shoe1;

        System.out.println(shoe1+" "+shoe2+" "+shoe3);
    }
}
