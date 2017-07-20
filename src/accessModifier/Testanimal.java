package accessModifier;

public class Testanimal {
	

	public static void main(String[] args) {
	
    Animal a= new Animal();
    a.color();
    a.enrgry();
    a.sound(); //defaut access modifier call in the same package
	}
}


