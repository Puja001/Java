package exception;

public class NullPointerExcep {

	public static void main(String[] args) {
		
		
		try{
				String str=null;
				System.out.println (str.length());
			}
			
		catch(NullPointerException e){
				System.out.println(" NullPointerException..");
			}
			
		finally{
				System.out.println(" This is finally NullPointerException..");
			}
}

}

	