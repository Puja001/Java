package array;

public class LinearSearchArray {

	public static void main(String[] args) {
		
		int [] arr={30,60,57,84,74,49,};
	
		int search=57;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == search)/* Searching element is present */
		      {
		         System.out.println(search + " is present at location "+i);
		        break;  
             

		      }
		}
				  
		}
}
	