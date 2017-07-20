package collection;
import java.util.*;  

public class Student {
	
	String name;
	int id;
	  Student(String name, int id){
	  this.name=name;
	  this.id= id;
	 }

	

	public static void main(String[] args) {
		
		Student s1= new Student("Puja",001);
		Student s2= new Student("Priya",002);
		Student s3 = new Student("Priynka",003);
		Student s4= new Student ("Vijay",004);
		Student s5=  new Student ("Sachin",005);

	ArrayList<Student> list =  new ArrayList<Student>();
	
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
	
	 System.out.println( "Element at 2nd position: " +list.get(2));
	
	   //Getting List Iterator  
	  
	  ListIterator<Student> itr=list.listIterator();  
	  
	    System.out.println( "Printing The List forward order...");
	 
	     //traversing elements of ArrayList object 
	    while(itr.hasNext()){  
	    Student st=(Student)itr.next();  
	    System.out.println(st.id+"- "+st.name); 
	    }
	    
	   
	   System.out.println( "Printing The List reverse order..."); 
	 
	    while(itr.hasPrevious()){  
		    Student st=(Student)itr.previous(); 
		    System.out.println(st.id+"- "+st.name); 
		    }

	}
}


