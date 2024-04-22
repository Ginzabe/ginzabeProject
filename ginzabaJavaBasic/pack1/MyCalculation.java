package pack1;
public class MyCalculation extends Calculation {
	       static int val1 = 20;
	       static int val2 = 30;
		   public void multiplication(int x, int y) {
		      z = x * y;
		      System.out.println("The product of the given numbers:"+z);
		        }
		
		   public static void main(String args[]) {
		      int a = 20, b = 10;
		      MyCalculation demo = new MyCalculation();
		      
		      demo.multiplication(val1, val2);
		      
		      
		      demo.addition(val1,val2);
		      
		      demo.Subtraction(a, b);
		      
		      
		     
		   }
		}
























