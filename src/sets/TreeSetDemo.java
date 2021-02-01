package sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet <String> ts = new TreeSet<String>();
		
		ts.add("cn");
		ts.add("adj");
		ts.add("os");
		ts.add("es");
		
		//in tree set obj the ele are already sorted
		//hece in an obj if we need to store sorted order of elemenst we can use treeset
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
