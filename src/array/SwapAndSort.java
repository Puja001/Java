package array;

public class SwapAndSort {

	public static void main(String[] args) {
		int[] arr={1,2,5,6,4,};//1>2,1>5,1>6,1>4//2>5,2>6,2>4,5>6,5>4//6>4,4
		 int temp=0;
		
		 
		 for(int i=0;i<arr.length;i++)
			 
		 {
				for(int j=i+1;j<arr.length;j++)
				{
					
					if(arr[i]>arr[j]) 
					{
						//System.out.println(arr[i]);
						{	
                    temp=arr[i];
							//System.out.println("temp valu"+temp);
                    arr[i]=arr[j];
                    arr[j]=temp;
                    System.out.println("unsorted number "+arr[i]);
                    // int temp2=arr[i];
						}
       				
					}
				}
		 }	
		          System.out.println("sort array number is : ");
			      for(int i=0;i<arr.length;i++)
			    	  System.out.println(arr[i]);
			}
								
		 }
		
		