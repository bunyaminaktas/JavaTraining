package hw10;

public class Q11 {
    public static void main(String[] args) {
        String race = "";
        outer: // can be removed because it is not referenced

        /*Since the inner loop has broader condition than the
        outer loops condition, the outer do while also can be removed.
        This does not affect the output. */
        do {
            //inner label can be removed since it is not referenced.
            inner:
            do {
                race += "x";
            } while (race.length() <= 4);
        } while (race.length() < 4);
        System.out.println(race);
    }
}
