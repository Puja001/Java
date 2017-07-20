package loops;

public class PrintingPingPong {

	public static void main(String[] args) {
		int a= 15;
		
		if ((a%3)==0 && (a%5)==0) 
	{
			System.out.println("Print: PingPong");
		}
			else if(a%5==0)
			{
				System.out.println("Print: Pong");
			}
			else if(a%3==0)
			{
				System.out.println("Print :Ping");
			}
	
			else{
				 
					System.out.println("print: Print the number :"+a);
				}
				
						
	}
}
		
		
		


	


