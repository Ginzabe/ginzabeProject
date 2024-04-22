package pack1;

public class StudentClass {

	public static void main(String[] args) {
		String stnames [] = {"ABDUL","HANIF","JEAN","OMAR","SHAH","SHARUKH","AMIR","DEEPA","NAINA","GEETHA"};
        
		double stmarks [] = {88,76,66,56,78,70,90,89,58,60};
		// print name and marks of students
		for(int i=0;i<stnames.length;i++) {
		      System.out.println(stnames[i]+ "  "+stmarks[i]);
		}
	// get maximum mark of student
		double maxmark = stmarks[0];
		String maxname = stnames[0];
		for(int k=0; k < stmarks.length;k++) {
		   if(maxmark <  stmarks[k]) {
			   maxmark = stmarks[k];
			   maxname = stnames[k];
			   }
			}
		
		System.out.println("Maximum mark of student:"+maxname+" " +maxmark);
	
	
	// get minimum mark of student
	double minmark = stmarks[0];
	String minname = stnames[0];
	for(int k=0; k < stmarks.length;k++) {
	   if(minmark >  stmarks[k]) {
		   minmark = stmarks[k];
		   minname = stnames[k];
		   }
		}
	
	System.out.println("Minimum mark of student:"+minname+ " " + minmark);

}

}














