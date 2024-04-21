package pack1;

import java.util.StringTokenizer;

public class StringClass {

	public static void main(String[] args) {
		String [] unicodear = {"\u2080","\u2081","\u2082","\u2083","\u2084","\u2085"}; 
		String str1 = "AAABBBBCCCCCDDDDDDFFFFFF";
        char ch;
        int j = 0;
		for(int i=0;i<str1.length();i++) {
	    	  
	    	 ch = str1.charAt(i); 
	    	 
	    	 if(ch == 'A') {
	    		 
	    		 j++;
	    	 }
	    	 
	    	  
	      }
	      
	      System.out.print("A"+unicodear[j]);
	      System.out.print("B"+unicodear[j+2]);
	   
	      
	     
	}

}
