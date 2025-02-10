package animalAbstractClass;

// Abstract class must be declared with an abstract keyword
abstract class Animal {

	// it can have abstract method
	abstract void walk();

	//Non abstract methods
	void breathe() {
		System.out.println("This animal breathe air");
	}
	
	// Constructor for the Animal class
	Animal(){
		System.out.println("You are about to create an animal");
	}
}
