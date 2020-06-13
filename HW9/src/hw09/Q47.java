package hw09;

import java.util.*;
import java.util.function.*;


// Class name has been changed to Q47
public class Q47 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("-5");
		list.add("0");
		list.add("5");
		print(list, e -> e < 0);
	}
	public static void print(List<String> list, Predicate<Integer> p) {
		for(String num : list)
			//Original code
			//if(p.test(num))	// Since p expects Integer but num is String, this line does not compile.
			if(p.test(Integer.valueOf(num)))
				System.out.println(num);
	}
	
}
