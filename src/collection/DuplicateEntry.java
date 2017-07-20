package collection;

import java.util.HashSet;


public class DuplicateEntry {

	public static void main(String[] args) {
		
		  String[] strArr = {"one","two","three","four","four","five"};
		        HashSet<String> unique = new HashSet<String>();
		        for(String str:strArr){
		            if(!unique.add(str)){
		                System.out.println("Duplicate Entry is: "+str);
		            }
		        }
		    }
		}

	
