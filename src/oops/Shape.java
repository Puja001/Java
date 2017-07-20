package oops;

public abstract class Shape {
	
	
	public int noOfSides;
	public float length;
	public float width;
	public float area;
	public float perimeter;
	//public int setSide;
	
	
	abstract float calculateArea();
	
	
	 float calculatePerimeter(){
		  return 2*(length+width);
	 }
		  
	 int setSide(){
		 return (noOfSides);
	 }
					
	 }


