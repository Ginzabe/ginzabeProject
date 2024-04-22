package pack1;

public class CalculatAreaMainClass {

	public static void main(String[] args) {
		
		
		CalculateAreas   ca = new  CalculateAreas();
		
		double rArea  = ca.rectangleArea(23.5, 2.0);
		
		System.out.println("Rectangle area:"+rArea);
		
		
		double cArea = ca.circleArea(5.5);
		
		System.out.println("Circle area:"+cArea);

	}

}
