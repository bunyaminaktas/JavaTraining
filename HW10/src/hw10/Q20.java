package hw10;

public class Q20 {
    public static void main(String[] args) {
        int result = 8;
        loop: while (result > 7) { 
            result++;
            do {
                result--;
            } while (result > 5); //executed until result becomes 5
            break loop;
        } System.out.println(result); 
    }
}
