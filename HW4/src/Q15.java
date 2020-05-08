import java.util.*;

public class Q15 {
	public static void main(String...strings) {
		/* 
		 * - Varargs can be used to create a List but it will be fixed size,
		 * which will prevent changing its size by addin or removing a new element.
		 */
		List<String> list = Arrays.asList("one", "two");
		list.add("new");
		System.out.println(list);
	}
}
