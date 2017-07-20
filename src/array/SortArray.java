package array;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr = {78,0,13,5,33,454,3,2};
		 
		int temp=0;
		
		 	 
		for (int i=0;i<arr.length;i++)
		{
			for(int j= i+1;j<arr.length;j++)
			{
		
				if( arr[i]> arr[j])
					{
					temp=arr[i];
					
				//System.out.println(temp);
				
				arr[i]=arr[j];
				//System.out.println(arr[i]);
				arr[j]=temp;
				//System.out.println(arr[j]);
				
				
				
					}
			}
			//System.out.println("sort array number is : " + arr[i] );
		}
		System.out.println("sort array number is : ");
	      for(int i=0;i<arr.length;i++)
	    	
	    	  System.out.print(" " + arr[i]);
	    	
	          
	}
		 
	 
		
	      // System.out.print("print the number in accesending order");
			 /*for(int i=0;i<arr.length;i++);
			 {
				 System.out.println("sort array number is"+ arr[i] );
			 } */
}
	
		


	       /* int n, temp;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");*/


	


