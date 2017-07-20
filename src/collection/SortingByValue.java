package collection;
import java.util.*; 
import java.util.Map.Entry;

public class SortingByValue {

	public static void main(String[] args) {
		 
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
       
		
		tmap.put(50,"c");
		tmap.put(10,"a");
		tmap.put(30,"b");
		tmap.put(20,"e");
		tmap.put(80,"f");
		tmap.put(40,"d") ;
		  
	   Iterator<Entry<Integer, String>> iter = tmap.entrySet().iterator();
	   while(iter.hasNext()) {
	   Map.Entry mentry = (Map.Entry)iter.next();
	   System.out.println("key is: "+ mentry.getKey() + " & Value is: " +mentry.getValue());
	    
}
	}
}
	
	
 
	

	

