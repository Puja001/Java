package accessModifierNonSubClass;
import accessModifier.Animal;

public class diffPackNonSubClass {
	
	public static void main(String[] args)
	{
	//********Different package non subclass implementation************
		Animal a1 = new Animal();
		a1.eat();
		a1.color();
		a1.walk();
		String name; //This varibale to hold the string value that is returned from Animal name() implementation
		name = a1.name();
		System.out.println(name);
	}

}

	
						