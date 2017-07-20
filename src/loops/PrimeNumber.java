package loops;

public class PrimeNumber {

	

	public static void main(String[] args) {
	
	
      int[]arr={37,78,9,00,8,65,67};
     
      
		 for(int i=0;i<arr.length;i++){
			 boolean isPrime = true; //i=0
			 
			 
			 for(int j=2;j<arr[i];j++){ //j=2
				if(arr[i]%j==0)
			 {
				
				 //System.out.println(arr[i] );
				 isPrime =false;
				 break;
				 
			 }
			 
		 }
		 
		 
		if(isPrime)
		
			System.out.println(arr[i] +" is a Prime number");
		}
	
}
}
			
			
		
	

