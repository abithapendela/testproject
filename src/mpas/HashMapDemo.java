package mpas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//hashmap obj cration
	
	HashMap<String,Contact> cts = new HashMap<String,Contact>();
	
	//adding objects
	cts.put("xyz@gmail.com",new Contact("xyz@gmail.com","xyz","9999999999"));
	cts.put("abc@gmail.com",new Contact("abc@gmail.com","abc","1236547890"));
	
	
	//printing with size
	System.out.println(cts);
	System.out.println(cts.size());
	
	//contains
	System.out.println(cts.containsKey("abc@gmail.com"));
	System.out.println(cts.containsValue("xyz@gmail.com"));
	
	//iterating hashmap
	
	Set keys = cts.keySet();
	
	Iterator keysit = keys.iterator();
	while(keysit.hasNext()) {
		// String key = keysit.next();   ->>>>>type mismactc
		
		String key = keysit.next().toString();
		Contact c = cts.get(key);
		System.out.println("email:"+c.getEmail());
		System.out.println("mobile:"+c.getMobile()); 	
		
		
		/* HAshMap output:{xyz@gmail.com=mpas.Contact@7637f22, abc@gmail.com=mpas.Contact@4926097b}
2
true
false
email:xyz@gmail.com
mobile:9999999999
email:abc@gmail.com
mobile:1236547890
   */
		
		/*using linked has map mottam same ae kani hashmap place lo linkedhashmap pedtam ante
		
		
		//linkedhashmap obj cration
		
		LinkedHashMap<String,Contact> cts = new LinkedHashMap<String,Contact>();
		
		//adding objects
		cts.put("xyz@gmail.com",new Contact("xyz@gmail.com","xyz","9999999999"));
		cts.put("abc@gmail.com",new Contact("abc@gmail.com","abc","1236547890"));
		
		
		//printing with size
		System.out.println(cts);
		System.out.println(cts.size());
		
		//contains
		System.out.println(cts.containsKey("abc@gmail.com"));
		System.out.println(cts.containsValue("xyz@gmail.com"));
		
		//iterating hashmap
		/*
		Set keys = cts.keySet();
		
		Iterator keysit = keys.iterator();
		while(keysit.hasNext()) {
			// String key = keysit.next();   ->>>>>type mismactc
			
			String key = keysit.next().toString();
			Contact c = cts.get(key);
			System.out.println("email:"+c.getEmail());
			System.out.println("mobile:"+c.getMobile());
			
		*/	
			
			
			//output if we use linked hasp map
			/*
			 {xyz@gmail.com=mpas.Contact@5d22bbb7, abc@gmail.com=mpas.Contact@41a4555e}
				2
				true
				false
				email:xyz@gmail.com
				mobile:9999999999
				email:abc@gmail.com	
				mobile:1236547890
			 	*/ 
		
		
		
		
		/*  treemap output:
		 * 
		 * 
		 * tree map vadetapudud adi sorted lo insert avtadi so print chesetapudu 1st abc@mail tarvata xyz
		 * {abc@gmail.com=mpas.Contact@71dac704, xyz@gmail.com=mpas.Contact@123772c4}
2
true
false
email:abc@gmail.com
mobile:1236547890
email:xyz@gmail.com
mobile:9999999999
 */
		 
	}
	}

}
