package oops;


class Rectangle extends Shape {
		
 public Rectangle(int noOfSides, float length, float width){
			 
			this.noOfSides= noOfSides;
			this.length = length;
			this.width=width;
			
			
		}
 	 public int setSide(){
 	  return noOfSides;
 		 
 	  }
		//  parent abstact method providing implemetation.
		public float calculateArea(){
			  return length*width;
	}
		
	
}
