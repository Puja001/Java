package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderAndInputStream {
	 
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 

        public static void main(String[]args)throws IOException
		    {
		    int x;
		    int y;
		    int total;

		    {
		    
		        System.out.print("Enter 1st Number :");
		        x = Integer.parseInt(br.readLine());
		        System.out.println(" ");

		        System.out.print("Enter 2nd Number :");
		        y = Integer.parseInt(br.readLine());
		        System.out.println(" ");

		        {
		        	total= x-y;
		        }
			     System.out.print("Ans : ");
		          
		        	System.out.println(total);
		        }

}

}