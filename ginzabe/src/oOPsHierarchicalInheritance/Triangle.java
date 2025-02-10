package oOPsHierarchicalInheritance;

import oOPsSingleInheritance.Shape;

public class Triangle extends Shape {

	// Deriving more than one class from a base class.

	public void area(int h, int b) {
		System.out.println((1 / 2) * b * h);
	}

}
