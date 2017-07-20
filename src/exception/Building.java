package exception;



public class Building {
	
	String color = null;
	int i=10,j=0;
	
 void color()
 {
		
try
   { 
    	  //System.out.println (i/j);
    	   //System.out.println (color.length());
	       try
	       { 
	    	  
	    	   System.out.println (color.length());
	       }
      
       
	      catch(NullPointerException e){
		   System.out.println(" NullPointerException..");
	       }
       
	       try
	       { 
	    	   System.out.println (i/j);
	       }
       
	      catch(ArithmeticException e){
    	   System.out.println(" ArithmeticException..");
           }	
       
  }
       
finally{
    	   System.out.println(" Confirmation that exception(s) occurred..");
}

}
}

