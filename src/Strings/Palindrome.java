package Strings;

public class Palindrome {

	public static void main(String[] args) {
		
		String s="MADAM";//moom
		

	    for (int i=0 , j=s.length()-1 ; i<j ; i++ , j-- ) {

	        if ( s.charAt(i) != s.charAt(j) ) {
	        	System.out.println("Not Palindrome");
			}
			else{
			System.out.println("The string is Palindrome");
		 
		}
	        }
	}
}
	    
	
		
		 
		
		  /*String revstring="";
		 *for(int i=str.length()-1;i>=0;--i){
			revstring +=str.charAt(i);
			}
			 
			System.out.println(revstring);
			 
			if(revstring.equalsIgnoreCase(str)){
			System.out.println("The string is Palindrome");
			}
			else{
			System.out.println("Not Palindrome");
		 
		}
		

	}
}



}*/
