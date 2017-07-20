package Strings;

public class ResverseWord {

	public static void main(String[] args) {
		
     String str = "My Name is java";
     String str1="";
     String a[]= str.split(""); 
    
     
     //String reverse="";
     
         
      for(int i =0;i<a.length;i++)
        {
        	System.out.print(a[i]+"");
        
         }
        System.out.println("");
        
       for(int i=a.length-1;i>=0;i--)
       // for(int j>=0; j=a.length-1;j--){
        
        	str1= str1+a[i]+"";
       
        System.out.print(str1 +"");
	}
}

