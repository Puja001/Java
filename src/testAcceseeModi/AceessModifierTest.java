package testAcceseeModi;

import accessModifier.Cat;
import accessModifier.Dog;
import accessModifier.Animal;

public class AceessModifierTest extends Animal {
	
	//********Different package subclass implementation************

	public static void main(String[] args) {
		
	  //Call Cat local method 
		Cat c= new Cat();
        c.meow();
        c.walk();
        c.eat();
      
      //Call Dog local method  
      Dog d= new Dog();
        d.bark();
        
	}

}
