package animalAbstractClass;

public class Horse2 extends Animal {

	// Constructor for the Horse class
    Horse2() {
        // Use super to call the parent class (Animal) constructor
        super();
        System.out.println("Wow; you have created a Horse!");
    }

    @Override
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}


