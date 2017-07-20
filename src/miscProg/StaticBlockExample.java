package miscProg;

public class StaticBlockExample {

	 private String name;
	 
	
	StaticBlockExample(int x) {
	        System.out.println("In 1 argument constructor, name = " + this.name);
	    }
	 
	StaticBlockExample() {
	        name = "Puja";
	        System.out.println("In no argument constructor, name = " + this.name);
	 
	    }
	 
	    /* First static initialization block */
	    static {
	        System.out.println("In first static init block ");
	    }
	 
	    /* First instance initialization block  */
	    {
	        System.out.println("In first instance init block, name = " + this.name);
	    }
	 
	    /* Second instance initialization block */
	    {
	        System.out.println("In second instance init block, name = " + this.name);
	    }
	 
	    /* Second static initialization block  */
	    static {
	        System.out.println("In second static int block ");
	    }
	 
	    public static void main(String args[]) {
	        new StaticBlockExample();
	        new StaticBlockExample();
	        new StaticBlockExample(1);
	    }
	 
	

	
}
