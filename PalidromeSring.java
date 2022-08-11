package JavaBasic;

import java.util.Scanner;

public class PalidromeSring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		  String a="TAAT";
		 String b="";
		
	        
	        int n = a.length();
	        for(int i = n - 1; i >= 0; i--)
	        {
	            b = b + a.charAt(i);
	        }
	        if(a.equalsIgnoreCase(b))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }
	
		

	}

}
