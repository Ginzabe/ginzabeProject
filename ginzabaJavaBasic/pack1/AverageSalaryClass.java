package pack1;

public class AverageSalaryClass {
	
	public double calculateAverageSalary(double [] sal) {
        double totalSalary = 0;
        double averageSalary=0;
        for(int k1=0;k1 < sal.length; k1++) {
		        totalSalary = totalSalary + sal[k1]; 
			   // System.out.print(sal[k1]+" ");
		       }
	      // System.out.println();
	      // System.out.println("Total salary of Employees:"+ totalSalary);
	       averageSalary = totalSalary / sal.length;
	   // System.out.println("Average salary of Employees:"+ averageSalary);
	 return averageSalary;
	    
}

}
