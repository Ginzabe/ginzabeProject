package animalAbstractClass;

public class Horse extends Animal {

	// This is a child class for Animal parent class

	// Constructor for the Horse class
	Horse() {
		System.out.println("Wow; you have created a Hourse!");
	}

	@Override
	void walk() {
		System.out.println("Horse walks on 4 legs");

	}

}
