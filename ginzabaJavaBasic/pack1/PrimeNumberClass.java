package pack1;

public class PrimeNumberClass {

	public static void main(String[] args) {
		int givenNumber = 23;
		int flag = calcPrime(givenNumber);
		
		if(flag == 1) {
			System.out.println("Number is not prime:"+givenNumber);
			
		}
		else {
			System.out.println("Number is  prime:"+givenNumber);
		}

	}
	
	public static int calcPrime(int number) {
		
         int result  = 0;
		
		
		 for(int i = 2; i< number; i++) {
			
			if (( number %  i ) == 0) {
				result = 1;
				
				
				break;
			}
		}   // end for loop 
		 return result;
		
		
		
	}

}
 