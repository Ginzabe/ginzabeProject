package pack1;

public class WhileClass {

	public static void main(String[] args) {
	int arr1 [] = {	  80 , 70,  90,  95,  75,  67};
	
	
	double total = 0;
	              
	for(int f=0; f < arr1.length; f++) {
		
		total = total + arr1[f];
			
	}
	
	System.out.println("Student Total:"+total);
	double average  = total / arr1.length  ;
	System.out.println("Student Average:"+average);
	 

	}

}
