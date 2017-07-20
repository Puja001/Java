package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputFileCopying {

	public static void main(String[] args) throws IOException{
		

		      FileInputStream in = null;
	          FileOutputStream out = null;

		      try {
		         in = new FileInputStream("/Users/Praween/Documents/Javacode/javabasics/Test1.txt");
		         out = new FileOutputStream("/Users/Praween/Documents/Javacode/javabasics/Test2.txt");
		         
		         int c;
		         while ((c = in.read()) != -1) {
		            out.write(c);
		         }
		      }finally {
		         if (in != null) {
		            in.close();
		         }
		         if (out != null) {
		            out.close();
		         }
		         System.out.println("Copied Sucessfully!");
		      }
		   }
		


	}


