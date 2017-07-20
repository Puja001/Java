package oops;

public class TestShape {

	public static void main(String[] args) {
		 
		float f;
		

		Shape s  = new Rectangle(4, 4.0f, 5.0f);
	
		f= s.calculatePerimeter();
		   {
			System.out.println("The Permemeter of Shape is: " + f);
		     }
		f=s.calculateArea();
		    {
			System.out.println("The Rectangle area  is: "+ f);
		    }
		    f= s.setSide();
		     {
		   	  System.out.println("The setside of rectangle :" + f); 
		     }
	    
		
		
		
		Circle c  = new Circle(1,3);
		
	
	    f= c.calculateArea();
	    {
		 System.out.println("The Area of Circle :" + f);
	    }
        f= c.calculatePerimeter();
      {
    	  System.out.println("The Permemeter of circle :" + f); 
      }
     f= c.setSide();
     {
   	  System.out.println("The setside of circle :" + f); 
     }
     
	}

}
