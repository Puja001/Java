package loops;

public class SwapNumberThirdVariable {

	public static void main(String[] args) {
		int temp;
		int x=5;
		int y=6;
		
		temp=x;
		x=y;
		y=temp;
		 
		System.out.println(" Now X is " +  x +  " Y is " +  y);
		
		
		//Without using Third Variable 
          x=5;
          y=6;
          x= x+y;//11
          y= x-y;//5
          x= x-y;//6
           
          System.out.println(" Now X is " +  x +  " Y is " +  y);
      
	}

}
