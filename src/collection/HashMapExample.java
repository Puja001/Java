package collection;
import java.util.*;
import java.util.Map.Entry;



public class HashMapExample {

	public static void main(String args[]) {
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");
		  hm.put(103,"Puja");
		  //System.out.println("element at 2nd position: "+hm.get(102));
		  /*String val=hm.get(101);
		  System.out.println("The Value mapped to Key 1 is:"+ val);
	*/
		 
		   
	       Iterator<Entry<Integer, String>> iter = hm.entrySet().iterator();
	       while(iter.hasNext()) {
	        Map.Entry mentry = (Map.Entry)iter.next();
	        System.out.println("key is: "+ mentry.getKey() + " & Value is: " +mentry.getValue());
	         
	}
}
}
	
