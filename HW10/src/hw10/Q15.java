package hw10;

import java.util.ArrayList;
import java.util.List;

public class Q15 {
    public static void main(String[] args) {
        List<String> a = new ArrayList(); // gives warning
        //List<> b = new ArrayList(); //identifier is expected
        List<String> c = new ArrayList<>();
        //List<> d = new ArrayList<>(); //identifier is expected
        List<String> e = new ArrayList<String>();
        //List<> f = new ArrayList<String>(); //identifier is expected
    }
}


