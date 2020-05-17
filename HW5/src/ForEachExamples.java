import java.util.*;

public class ForEachExamples {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		
		/*
		 * - If we try to make some modification over the collection during iteration
		 * through them Java will throw an exception at runtime indicating that this operation
		 * cannot be done.
		 * 
		 * - To avoid this either we can use traditional for loop or Iterator class as below:
		 * 
		 * Iterator<String> iter = strList.iterator();
		 * while(iter.hasNext()){
		 * 	String str = iter.hasNext();
		 * 	if(str.equals("A")
		 * 		iter.remove();
		 * }
		 */				
		
		for(String str : strList) 
			if(str.equals("A"))
				strList.remove(str);
		
	}
}
