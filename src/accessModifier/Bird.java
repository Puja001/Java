package accessModifier;

	 public class Bird extends Animal{
		
		public void sound(){
		System.out.println(" I cant tweet");
		}
		
		private void fly(){
			System.out.println("I can fly");
		}
		
		
	public static void main(String[] args) {
		
		//********same package subclass implementation************
  
		Bird b= new Bird();
		b.sound(); //this is a call for the defulat access modifier
		b.fly();
		b.walk();
		b.eat();
		b.color();
		
		String name; //This varibale to hold the string value that is returned from Animal name() implementation
		name = b.name();
		
		System.out.println(name);
		
		b.enrgry();
		
	
	} 
 
}
