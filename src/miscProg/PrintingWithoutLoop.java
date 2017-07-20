package miscProg;

  public class PrintingWithoutLoop {
	  
	  public static void print(int n) {
	    if(n > 1) {
	        print(n-1);
	    }
	    System.out.println(n);
	
	  }
	
	


	public static void main(String[] args) {
		
		print(10);

	
	  

}
	}
