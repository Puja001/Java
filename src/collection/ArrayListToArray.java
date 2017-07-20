package collection;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		/*ArrayList declaration and initialization*/
		
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add("Sachin"); 
		al.add("Puja");
		
		/*ArrayList to Array Conversion */
		String frnames[]=al.toArray(new String[al.size()]);

		/*Displaying Array elements*/
		for(String k: frnames)
		{
			System.out.println(k);
		}
	}

	}

