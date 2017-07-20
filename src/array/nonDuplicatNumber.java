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
	        //System.out.println("");
	       // System.out.println("Number of non repeated elements are:"+ count);
	    }
	}
	
	         /*for(int i=0;i<arr.length;i++){
	            boolean isUnique = false;
	            for(int j=0;j<arr.length;j++){
	            	if(i!=j)
	            	{
	            	  if (arr[i]!=arr[j])
	            	  {
	            		isUnique =true;
	            		  break;
	         
	            	  }
	            	  else
	            	  {
	            		
	       
	            	if(isUnique) {
	            		   
	                    System.out.println(arr[i]+ "are repititive");
	            		
	            	
	            	}
	            		
	            }
           }
         
        	   
          

	}
	         }
	}
}
*/




	              

	
	              /* for(int i=0;i<arr.length;i++){
		            boolean isUnique = false;
		            for(int j=i+1;j<arr.length;j++){
		                if(arr[i] == arr[j]){
		                    isUnique = true;
		                    break;
		                }
		            }
		            if(!isUnique){
		                System.out.print(arr[i]+" ");
		            }
		        }
		    }*/
		     
		            	
             
	/*public static void main(String[] args) {            
		 int[] nums={2,2,3,4,3,7,5}; 5
		 findNonDupl(nums);
		 //System.out.println("Number of non repeated elements are:"+count);
	}
}*/
	 
		 
		
	 
	 
			  
	

		 
	 
	