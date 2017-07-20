package array;

public class largestNumberArray {

	public static void main(String[] args) {
		 
			
			 int arr1[] ={45,5,78,10,12,};
			 
         int largest= arr1[0];
		 int number=arr1[0];
		
		 
	
		 
		 for(int i=0;i<arr1.length; i++)
		 {
		 
		
				 if(arr1[i] >largest){   //78>45
				 number=largest;
				  largest= arr1[i];
				  
				
				  
				  

				 }else if (arr1[i]>number)
					 number=arr1[i];
			 }

				 
	{
				 
		           System.out.println("first largest number in the array is: "+largest);
	
}

}
}


				 
	

	

		
		/*int arr1[] ={45,5,78,10,12,};
		int num=0;
      for(int i=0;i<arr1.length;i++)
    {
	 for(int j=i+1;j<arr1.length;j++){
		 
		// if( arr1[i] > arr2[j])//3>6
			 //temp= arr1[i];
			if( arr1[i]>arr1[j]){
				num= arr1[i];
				
				System.out.println( "result:"+ arr1 );//arr1[i]);
			 //arr2[j]=temp;
		 }
	 }
}
			 
	 
}
}*/