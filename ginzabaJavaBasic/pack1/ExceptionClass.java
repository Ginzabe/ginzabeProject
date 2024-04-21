package pack1;

public class ExceptionClass {

	public static void main(String[] args) {
		int d = 5;
		double[] arr1 = {20.5,30.6,40.7};
		try {
		 //  System.out.println("Beginning of TRY statement");
		   int a = 42 / d;
		   System.out.println(a);
		   System.out.println(arr1[5]);
		   System.out.println("End of TRY statement");	
		}	
		catch(Exception ae  ) {
		//	System.out.println("Beginning of CATCH TRY statement");
			
			System.out.println(ae.getMessage());
			
		}
		
		
		finally {
			
		//	System.out.println("We are in the FINALLY Block");
		}
	//	System.out.println("Value of d:"+d);
	//	System.out.println("We have reached end of program");
		
		
	}

}
