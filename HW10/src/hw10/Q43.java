package hw10;

import java.util.*;
public class Q43 {
    public static void main(String[] args) {
        args = new String[] {"0", "1", "01", "10" };
        Arrays.sort(args); //in alphabetic order

        //[0, 01, 1, 10]
        System.out.println(Arrays.toString(args));
    }
}
