package hw10;

public class Q32 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0); //removes "r"
        sb.delete(1, 1);// removes nothing
        System.out.println(sb);
    }
}
