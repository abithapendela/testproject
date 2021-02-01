package list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<House> houses = new LinkedList<House>();
		houses.add(new House("simple window","wood door","furniture room"));
		houses.add(new House("woor window","abc door","red color room"));
		houses.add(new House("beautiful window","plastic door","green color room"));
	
	
		
		//traversing list
		
		for(House h:houses) {
			System.out.println(h.getDoors());
			System.out.println(h.getRooms());
			System.out.println(h.getWnd());
		}
		
		//add first
		houses.addFirst(new House("a","b","c"));
		houses.addLast(new House("lk","lksd","dh"));
		
		System.out.println(houses.size());
		
		for(House h:houses) {
			System.out.println(h.getDoors());
			System.out.println(h.getRooms());
			System.out.println(h.getWnd());
		}
		
		//similarly we have removefirst removelast
	}

}
