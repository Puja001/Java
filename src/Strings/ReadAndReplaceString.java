package Strings;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileReader;
import java.io.FileWriter;

import java.io.InputStreamReader;

public class ReadAndReplaceString {

	
	public static void main(String args[]) throws Exception{
		
		File log= new File("/Users/Praween/Documents/Javacode/javabasics/Test3.txt");
		String search = "Testing";
		String replace = "java";

	
			 try {
			        FileInputStream fstream = new FileInputStream(log);
			        DataInputStream in = new DataInputStream(fstream);
			        BufferedReader br = new BufferedReader(new InputStreamReader(in));

		            FileReader fr = new FileReader(log);
		            String s;
		            String totalStr = "";
		   
		        while ((s = br.readLine()) != null) {
		            totalStr += s;
		           
		        }
		        totalStr = totalStr.replaceAll(search, replace);
		        FileWriter fw = new FileWriter(log);
		    fw.write(totalStr);
		    fw.close();
		    fr.close();
		    br.close();
		   System.out.println("Replaced!!"    +totalStr );
		    
		}catch(Exception e){
		    e.printStackTrace();
		}
	}
}

		
		
	  