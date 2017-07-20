package oops;

public class Circle extends Shape implements ShapeConstants {
	
	//Constructor
    // public  Circle(){
     	// System.out.println("To set number of sides.");
     // }
	 public  float radius;
	 
	 
	 public Circle(int noOfSides,float radius){
		  this .noOfSides = noOfSides;
		  this.radius = radius;
		  
			//public abstract float calculateArea();
			
	 }
		
	 //@override
		  public float calculateArea(){
			  return pi*radius*radius;
		  }
		  
		  
		//override  
		  public float calculatePerimeter(){
			  return 2* pi*radius;
		  }
		  
		  //overloading
		  public int setSide(){
			 return noOfSides;
		  }
		 
		  //public float setSide(){
				// return(radius+radius);
		 //}
}
		  
	 
	 


