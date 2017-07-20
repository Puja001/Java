package array;

public class MergeTwoArray {

	public static void main(String[] args) {
		
      int[] arr1={2,5,7,56,78,46,78,};
      int[] arr2={4,6,5,43,27,68,98,};
      int[] merge= new int[arr1.length+arr2.length];
      int c=0;
      
      for(int i=0;i<arr1.length;i++)
	      {
	    	  merge[i]=arr1[i];
	    	  c++;
	      }
      for(int j=0;j<arr2.length;j++)
	    	{
	    		merge[c++]=arr2[j];
	    		
	    	}
      for(int i=0;i<merge.length;i++)
	      {
	    	  System.out.println("Merged array numbers :" + merge[i]);
	      }
	}

}