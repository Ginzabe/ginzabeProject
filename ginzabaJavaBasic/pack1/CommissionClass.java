package pack1;

import java.util.Scanner;

public class CommissionClass {

	public static void main(String[] args) {
		double commission=0;
		double giveSalesAmount=0;
	//	double givenSalesAmount = Double.parseDouble(args[0]);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Sales Amount:");
		giveSalesAmount = sc.nextDouble();
		
		if(giveSalesAmount < 1000) {
		    commission = 0.05 * giveSalesAmount;
		  }
		else if(giveSalesAmount < 5000) {
		  commission = 0.10 * giveSalesAmount;
		    }
		else {
			commission = 0.15 * giveSalesAmount;
			}
	System.out.println("Sales Amount:"+giveSalesAmount +" " +"Commission:"+commission);
	}

}
