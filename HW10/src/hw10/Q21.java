package hw10;

public class Q21 {
    static int teeth; // set to 0
    double scaleToughness; // never used

    public Q21() {
        teeth++;
    }

    public void snap(int teeth) {
        System.out.print(teeth + " ");
        teeth--; // never used. This is not the static teeth.
    }

    public static void main(String[] unused) {
        new Q21().snap(teeth);
        new Q21().snap(teeth);
    }
}
