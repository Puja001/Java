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



	/*public static void main(String[] args) {
		float f;
		  Shape s = new Rectangle(2,3.0f,4.0f);
		 
		  f = s.calculatePerimeter();
		  System.out.println("The Permemeter of given number is " + f);
			
		 f =  s.calculateArea();
			
		 System.out.println("The rectangle area of given number is "+ f);
		 
	}

}*/
