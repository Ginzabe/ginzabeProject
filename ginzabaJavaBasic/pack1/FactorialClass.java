package pack1;

public class FactorialClass {
	
	public static void main (String args[]) {
		
		int answer=0;
	
		for(int result=0;result <= 10; result=result+1) {
		
			if(result % 2 == 1) {
		
			   System.out.println(result);
		       answer = answer + result;
	          }
		
		}
		
		System.out.println("SUM OF ODD NUMBERS:" + answer);
		
		
	}

}
