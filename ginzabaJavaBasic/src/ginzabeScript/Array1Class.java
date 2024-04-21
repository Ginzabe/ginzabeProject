package ginzabeScript;

public class Array1Class {

	
	public static void main(String[] args) {
		
		int []  studentMarks = {75,86,56,43,90,97,45,34,56,99,78,45};
		
		int maxvalue = studentMarks[0];
		for(int g=1;g<studentMarks.length;g++) {
			   
			if( maxvalue >   studentMarks[g] ) {
				
				
				maxvalue = studentMarks[g];
				
			}
			
			
			
		}
		
		System.out.println("Maximum marks of student:"+maxvalue);
		
		
		
		
		
	}
}
