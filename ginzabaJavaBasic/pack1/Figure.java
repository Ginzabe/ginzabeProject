package pack1;

public abstract class Figure {
   abstract void calcArea(double length);
   
   void calcCircleArea(double radius) {
	   
	   double carea = 3.14 * radius * radius;
	   System.out.println("Circle area:"+ carea);
   }
  
}
