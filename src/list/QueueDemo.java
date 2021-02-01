package list;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		Queue<String> pq = new PriorityQueue<String>();
		
		//adding elements
		q.add("Sita");
		q.add("Lakshmi");
		q.add("ravana");
		
		pq.add("priority");
		pq.add("p4");
		pq.add("pq6");
		
		//printing elements
		
		System.out.println(q);
		System.out.println(pq);
		
		//poll , peek and ele functions
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q); //gives firtst ele but fo not remove anything
		
		//claer ele
		q.clear();
	//	System.out.println(q.element()); //it gives exception no such ele
		System.out.println(q.peek());  //here peek gives null if there is not there
		//so for peek it gives null ,for element() it gives exception
		

	}

}
