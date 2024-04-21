package pack1;

import java.util.StringTokenizer;

public abstract class StringClass3 {
	
	public abstract void calcArea();

	public static void main(String[] args) {
		
		
		String str1 = "I work in CRAFT SOFTWARE from 9AM;to;7PM";
		
		StringTokenizer st1 = new StringTokenizer(str1," ;");
		
	       
	    while(st1.hasMoreTokens()) {
	    	
	    	System.out.println(st1.nextToken());
	    }
	//  string split       
	    System.out.println("-----------------------"); 
	   String [] ar1 = str1.split(" ");
	   
	   for(int i=0;i < ar1.length;i++) {
	   
		   System.out.println(ar1[i]);
	  		

	}
	}
}
