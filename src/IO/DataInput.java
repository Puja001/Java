package IO;

import java.io.DataInputStream;
import java.io.IOException;

//import java.io.BufferedReader;

public class DataInput {
	
	
	
	public static void main(String[]args)throws IOException{
		

		 DataInputStream dis=new DataInputStream(System.in);
		  
	        //StringBuffer inputLine = new StringBuffer();
	

			    {
			   int x;
			   int y;
			    int total;

			    {
			    	
			       System.out.print("Enter 1st Number :");
			      // x=Integer.parseInt(dis.readInt());
			      // System.out.println((int)i);
			       
			      x =(dis.readInt());
			        
			       System.out.println(" ");

			       System.out.print("Enter 2nd Number :");
			        y =(dis.readInt());
			       System.out.println(" ");

			        {
			        	total=( x*y);
			        }
			       
			      
			           
			        	System.out.print("Ans : ");
			          
			        	System.out.println(total);
			        }

	}

	}

}
