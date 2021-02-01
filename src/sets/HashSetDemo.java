package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		
		//adding obj
		hs.add("s1");
		hs.add("s2");
		hs.add("s3");
		
		//print ele
		System.out.println(hs);
		
		//using iterator
		Iterator it = hs.iterator(); // 2nd dhi import cheyali
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//remove operation
		
		hs.remove(1);
		
		//contains
		System.out.println(hs.contains("s1"));
		System.out.println(hs.contains("f4"));
		

	}

}
