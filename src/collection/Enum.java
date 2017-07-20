package collection;

import java.util.*;

public class Enum {
	
	
	enum Month{ 
		      January,February,March,April,May,June,July,August,September,October,November,December;
		      }
							 
	public static void main(String[] args) {
		
		EnumSet<Month> allMonth= EnumSet.allOf(Month.class);
		System.out.println("AllMonth :"+allMonth);
		
		List<Month> list= new ArrayList<Month>(allMonth);
	
		ListIterator<Month> itr= list.listIterator();
		while(itr.hasNext()){  
		System.out.println(itr.next());
		
		
		
		
		  
		}
	}
}
		
		
		
		 
		 
		 
		 
		 
		
		/*// create array list object       
		   List<String> arrlist = new ArrayList<String>();
		      
		   // populate the list wwith all the months of an year
		   arrlist.add("January");
		   arrlist.add("February");
		   arrlist.add("March");
		   arrlist.add("April");
		   arrlist.add("May");
		   arrlist.add("June");
		   arrlist.add("July");
		   arrlist.add("August");
		   arrlist.add("September");
		   arrlist.add("October");
		   arrlist.add("November");
		   arrlist.add("December");
		  
		      
		   // create Enumeration
		   Enumeration<String> e = Collections.enumeration(arrlist);
		      
		   System.out.println("Print the enumeration");
		   System.out.println("======================");
		      
		   while(e.hasMoreElements()){
		   System.out.println("Month is: "+e.nextElement());
		   }
		   System.out.println("======================");
		   
		   }    
		}*/
