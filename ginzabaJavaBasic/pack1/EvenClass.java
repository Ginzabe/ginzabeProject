package pack1;

public class EvenClass {

	// method to calculate even numbers
	public int calcEven(int input,String myname) {
		System.out.println(myname);
		int answer=0;
		
		for(int result=0;result <= input; result=result+2) {
		     	System.out.println(result);	
		       answer = answer + result;
		       
	          }
		return answer;
		
		//System.out.println("SUM OF EVEN NUMBERS:"+ answer);
		
	}
	
	// method to calculate ODD numbers
	
public void calcOdd() {
		
		int answer=0;
		
		for(int result=1;result <= 10; result=result+2) {
		     		
		       answer = answer + result;
		       
	          }
		
		System.out.println("SUM OF ODD NUMBERS:"+ answer);
		
	}
	
	
}
