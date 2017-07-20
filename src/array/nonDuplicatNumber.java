package array;

public class nonDuplicatNumber {
	
	public static void main(String[] args) { 
		int flag=0;
		//int count=0;
		 int[] arr={2,3,4,2,3,7,5}; 
		 for(int i = 0; i <arr.length; i++)
	        {
	            for(int j = 0; j <arr.length; j++)
	            {
	                if(i != j)
	                {
	                    if(arr[i] != arr[j])
	                    {
	                        flag = 1;
	                      
	                    }
	                    else
	                    {
	                        flag = 0;
	                        break;
	                    }
	                }
	            }
	            if(flag == 1)
	            {
	               // count++;
	                System.out.print(arr[i]+" ");
	            }
	        }
	        
	    }
	}
	