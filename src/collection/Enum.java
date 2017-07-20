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
		
