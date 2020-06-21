package hw10;

interface Plant {
    default String grow() { return "Grow!"; }
}

interface Living {
    public default String grow() { return "Growing!"; }
}
public class Q26 implements Plant, Living { // m1 
    public String grow(int height) { //overloaded method
        return "Super Growing!";
    }

    /*
     * - Since both interfaces implemented by this class have a method named same, this class must override them.
     */
    public String grow() {
    	return "Grow";
    }
    	
    public static void main(String[] leaves) {
        Plant p = new Q26(); // m2
        System.out.print(((Living) p).grow()); // m3 }
    }
}