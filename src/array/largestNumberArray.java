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
