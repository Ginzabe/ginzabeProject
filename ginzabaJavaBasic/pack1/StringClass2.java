package pack1;
import java.util.regex.*;
public class StringClass2 {

	 public static void main(String args[]) {
		 String  str1 = "ABBA";
		 String  str2="";
	 // reverse the given string
		 for(int i=str1.length() - 1 ; i >= 0; i--) {
		    //	System.out.print(str1.charAt(i) + " ");
		  
		    	str2 = str2 + str1.charAt(i);
		     }
	// compare the two strings for palindrome 
		 System.out.println(str2);
		 
	//	 int result = str1.compareTo(str2);
		 
		 boolean result = str1.equals(str2);
		 
		 System.out.println("RESULT IS:" + result);
		 
		 if(result) {
			 System.out.println("String: " + str1 +" is a palindrome"); 
			 
		 }
		 else {
			 System.out.println("String: " + str1 +" is NOT  a palindrome");  
		 }
		 
		 
		 
	 }
}
