package hw10;

public class Q24 {
    public static void main(String[] args) {
        String tie = null;
        // Original code
        // while (tie = null) does not return a boolean
        while (tie == null)
            tie = "shoelace";
        System.out.print(tie); }
}
