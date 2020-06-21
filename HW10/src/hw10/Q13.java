package hw10;

import java.time.LocalTime;

public class Q13 {
    public static void main(String... nums) {
        LocalTime time = LocalTime.of(1, 11);
        while (time.getHour() < 1) {
            time.plusHours(1);
            System.out.println("in loop");
        }
    }
}
