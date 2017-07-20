package exception;


	public class RoomException extends Building{

		public static void main(String args[]){  
			  //Calling the parent class to invoke exceptions (Nullpointer, airthmetic)
			  Building obj = new RoomException();
			  obj.color();
		  } 
}


