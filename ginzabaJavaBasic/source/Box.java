package source;

public class Box {

	double width;
    double height;
    double depth;
    
    Box(){
    	width = 2;
        height = 6;
        depth = 10;	
    }
    
    
    Box(double w,double h,double d){
    	System.out.println("Calling SECOND construtor");
        width = w;
        height = h;
        depth = d;
       }
    Box(double w,double h){
    	
    	System.out.println("Calling THIRD construtor");
        width = w;
        height = h;
        depth = 5;
       }
    

    double volume(){
       return width * height * depth;
          }
    
   }

	
	



