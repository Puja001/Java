package array;

public class MissingNumber {
	
	public static int getMissingNumber(int[]array,int n){
		
	int actualSum=0;
	int expectedSum=(n*(n+1)/2);
	for(int i :array){
		actualSum=actualSum+i;
	}
		return expectedSum-actualSum;
		
	}
	
	public static void main(String[] args) {
		
 int[] array={1,2,3,4,6,};
 int missingNumber= getMissingNumber(array,6);
 System.out.println("Missing number is:"+missingNumber);

	}

}