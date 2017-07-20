package accessModifier;

public class Animal {
	
	private String name;
	private String color;
	
	//constructor implementation to initialize the property of the class
	//Made it public so that it will be called even in a different package in case required
	public Animal(){
		this.name = "Animal";
		this.color="Genereic White Color";
	}
	
	public void eat(){
		System.out.println("I can Eat");
		
	}
	
	public void color(){
		System.out.println("My color is:" + this.color); //using the local(proviate) property color
		}
	
	
	public void walk(){
		System.out.println("I can walk");
	}
	
	//Default access modifier implementation
	 void sound(){
		System.out.println("I can sound");
	}
	public String name(){
		//System.out.println("I am an :" + this.name);
		return name;
	}
	
	protected void enrgry(){
		System.out.println("I've a high energy but I'm feeling low today");
	}
	
	public static void main(String[] args) {
		
		//********same class implementation************
		
	      Animal a= new Animal(); 
	        a.enrgry(); //protected
	        a.sound();//default method call
	        a.color(); //Public mthod
	}
}
