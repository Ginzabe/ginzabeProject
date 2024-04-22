package pack1;

public class FibonacciClass {

	public static void main(String[] args) {

      int currentno = 0;
      int prevno    = 1;
      int sum = 0;
      
      System.out.print(currentno+" ");
      System.out.print(prevno+" ");
      
      
      for(int m=0;m < 10;m++) {
    	  
    	  sum = currentno  + prevno;
    	  System.out.print(sum +" ");
    	  
    	  currentno = prevno;
    	  prevno = sum;
      }

	}

}
