package sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creaing object
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		//adding objs
		
		lhs.add("s1");
		lhs.add("s2");
		lhs.add("s3");
		
		//using iterator
		
		Iterator it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//remove operation
		
		lhs.remove(1);
		
		//contains
		System.out.println(lhs.contains("s1"));
	}

}
