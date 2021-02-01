package list;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		ArrayList <String> stlist = new ArrayList<String>();
		
		//Adding dtr objs
		
		stlist.add("Abitha");
		stlist.add("akhil");
		stlist.add("suresh");
		stlist.add("syamala");
		stlist.add("pendela");
		
		//display list and its size
		System.out.println("list = "+stlist);
		System.out.println("size of array list = "+stlist.size());
		
		//adding and setting objs in list
		
		stlist.add(2,"newname");
		System.out.println(stlist);
		//if we use add then at that index ele will be inserted and remainng ele are also present
		stlist.set(3,"newname2");
		System.out.println(stlist);
		//when we use set at that index the value will be over riden
		
		//index and getting specific index objects
		
		System.out.println("index of abitha : "+stlist.indexOf("Abitha"));
		System.out.println("index of xyz : "+stlist.indexOf("xyz"));
		//if obj is present then it returns index else returns -1
		
		String str = stlist.get(4);
		System.out.println("4th location value is:"+str);
		
		//contains op
		System.out.println(stlist.contains("Abitha"));
		System.out.println(stlist.contains("suresh"));
		
		//remove objs
		stlist.remove("newname");  //deletees obj
		stlist.remove(2); //delets 2index
		System.out.println(stlist);
		
		//iterate list
		for(String s :stlist) {
			System.out.println(s);
		}
		
		
		//sort list
		Collections.sort(stlist);
		System.out.println(stlist); */
		// until here array list now linked list
		
		ArrayList <String> stlist = new ArrayList<String>();
		ArrayList <String> st = new ArrayList<String>(stlist);
		
		
		//Adding dtr objs
		
		stlist.add("Abitha");
		stlist.add("akhil");
		stlist.add("suresh");
		stlist.add("syamala");
		stlist.add("pendela");
		
		//display list and its size
		System.out.println("list = "+stlist);
		System.out.println("size of array list = "+stlist.size());
		
		//adding and setting objs in list
		
		stlist.add(2,"newname");
		System.out.println(stlist);
		//if we use add then at that index ele will be inserted and remainng ele are also present
		stlist.set(3,"newname2");
		System.out.println(stlist);
		//when we use set at that index the value will be over riden
		
		//index and getting specific index objects
		
		System.out.println("index of abitha : "+stlist.indexOf("Abitha"));
		System.out.println("index of xyz : "+stlist.indexOf("xyz"));
		//if obj is present then it returns index else returns -1
		
		String str = stlist.get(4);
		System.out.println("4th location value is:"+str);
		
		//contains op
		System.out.println(stlist.contains("Abitha"));
		System.out.println(stlist.contains("suresh"));
		
		//remove objs
		stlist.remove("newname");  //deletees obj
		stlist.remove(2); //delets 2index
		System.out.println(stlist);
		
		//iterate list
		for(String s :stlist) {
			System.out.println(s);
		}
		
		
		//sort list
		Collections.sort(stlist);
		System.out.println(stlist);
		
		//whether the objs of one list present in other
		ArrayList <String> stu = new ArrayList<String>(stlist);
		System.out.println(stu.equals(stlist));
		//here both lists same ele and obj
		
		//now one list has more no of ele,we need to check if objs of on elist is present pr not
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abitha");
		al.add("akhil");
		System.out.println(stlist.containsAll(al));
		//if abi is added to al then result will be false bcoz abi is not present in stlist
		
		
		
	}

}
