package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentList {

		public static void main(String args[]){ 
			
			ArrayList<String> al=new ArrayList<String>();  
			al.add("Amit");  
			al.add("Vijay");  
			al.add("Kumar");  
			al.add("Sachin"); 
			al.add("Puja");
			System.out.println("element at 2nd position: "+al.get(2)); 
			
			 //Getting List Iterator  
			ListIterator<String> itr=al.listIterator();
			
			
			System.out.println("Printing elements in forward direction...");  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}
	
			System.out.println("Printing  elements in reverse direction...");  
			while(itr.hasPrevious()){  
			System.out.println(itr.previous());  
			}  
			}  
	
	}


